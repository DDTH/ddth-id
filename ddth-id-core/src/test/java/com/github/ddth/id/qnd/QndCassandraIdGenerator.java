package com.github.ddth.id.qnd;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Session;
import com.github.ddth.cql.CqlUtils;
import com.github.ddth.id.SerialIdGenerator;
import com.github.ddth.id.cassandra.CassandraIdGenerator;

public class QndCassandraIdGenerator {

    private static class MyCassandraIdGenerator extends CassandraIdGenerator {
        public void initData(String... namespaces) {
            Session session = getSession();
            CqlUtils.execute(session, "TRUNCATE " + getTableName(), ConsistencyLevel.ALL);
            for (String namespace : namespaces) {
                CqlUtils.execute(session,
                        "UPDATE " + getTableName() + " SET " + getTableColumnValue() + "=0 WHERE "
                                + getTableColumnName() + "='" + namespace + "'",
                        ConsistencyLevel.ALL);
            }
        }
    }

    protected static SerialIdGenerator createSerialIdGenerator() {
        String hostsAndPorts = System.getProperty("hostsAndPorts");
        if (StringUtils.isBlank(hostsAndPorts)) {
            hostsAndPorts = "10.60.43.23:9042,10.60.43.24:9042,10.60.43.25:9042";
        }
        String user = System.getProperty("user");
        if (StringUtils.isBlank(user)) {
            user = "test";
        }
        String password = System.getProperty("password");
        if (StringUtils.isBlank(password)) {
            password = "test";
        }
        String keyspace = System.getProperty("keyspace");
        if (StringUtils.isBlank(keyspace)) {
            keyspace = "test";
        }
        String table = System.getProperty("table");
        if (StringUtils.isBlank(table)) {
            table = "ddth_id";
        }

        MyCassandraIdGenerator idGen = new MyCassandraIdGenerator();
        idGen.setHostsAndPorts(hostsAndPorts).setUser(user).setPassword(password)
                .setKeyspace(keyspace).setTableName(table);
        idGen.init();
        idGen.initData("default");
        return idGen;
    }

    public static void main(String[] args) {
        try (SerialIdGenerator idGen = createSerialIdGenerator()) {
            String namespace = "default";

            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                System.out.println("\tSet value    : "
                        + idGen.setValueWithRetries(namespace, i * 2, 5, TimeUnit.SECONDS));
                System.out.println("\tCurrent value: "
                        + idGen.currentIdWithRetries(namespace, 5, TimeUnit.SECONDS));
                System.out.println("\tNext value   : "
                        + idGen.nextIdWithRetries(namespace, 5, TimeUnit.SECONDS));
            }
        }
    }
}
