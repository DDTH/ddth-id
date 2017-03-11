package com.github.ddth.id.qnd;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.github.ddth.cql.CqlUtils;
import com.github.ddth.cql.SessionManager;

public class QndCassandra {

    private static long currentId(Session session, String namespace) {
        PreparedStatement stm = CqlUtils.prepareStatement(session,
                "SELECT id_value FROM ddth_id WHERE id_name=?");
        Row row = CqlUtils.executeOne(session, stm, ConsistencyLevel.LOCAL_QUORUM, namespace);
        return row != null ? row.getLong("id_value") : -1;
    }

    private static boolean setValue(Session session, String namespace, long newValue) {
        PreparedStatement stm = CqlUtils.prepareStatement(session,
                "UPDATE ddth_id SET id_value=? WHERE id_name=?");
        CqlUtils.executeNonSelect(session, stm, ConsistencyLevel.LOCAL_QUORUM, newValue, namespace);
        return true;
    }

    private static boolean setValue(Session session, String namespace, long newValue,
            long currentValue) {
        PreparedStatement stmInsertNew = CqlUtils.prepareStatement(session,
                "INSERT INTO ddth_id (id_name, id_value) VALUES (?, ?) IF NOT EXISTS");
        PreparedStatement stmUpdateExisting = CqlUtils.prepareStatement(session,
                "UPDATE ddth_id SET id_value=? WHERE id_name=? IF id_value=?");
        ResultSet result;
        if (currentValue < 0) {
            result = CqlUtils.execute(session, stmInsertNew, ConsistencyLevel.LOCAL_QUORUM,
                    namespace, newValue);
        } else {
            result = CqlUtils.execute(session, stmUpdateExisting, ConsistencyLevel.LOCAL_QUORUM,
                    newValue, namespace, currentValue);
        }
        return result != null ? result.wasApplied() : false;
    }

    private static long nextId(Session session, String namespace) {
        while (true) {
            long currentValue = currentId(session, namespace);
            if (currentValue < 0) {
                if (setValue(session, namespace, 1)) {
                    return 1;
                }
            } else {
                if (setValue(session, namespace, currentValue + 1, currentValue)) {
                    return currentValue + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        try (SessionManager sm = new SessionManager()) {
            Session session = sm.getSession("localhost:9042", "test", "test", "test");

            System.out.println(currentId(session, "default"));
            setValue(session, "default", 1981);
            System.out.println(currentId(session, "default"));

            System.out.println(nextId(session, "default0"));
            System.out.println(nextId(session, "default0"));
            System.out.println(nextId(session, "default0"));
            System.out.println(nextId(session, "default0"));
            System.out.println(nextId(session, "default0"));
        }
    }

}
