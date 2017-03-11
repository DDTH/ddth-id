package com.github.ddth.id.test;

import org.apache.commons.lang3.StringUtils;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Session;
import com.github.ddth.cql.CqlUtils;
import com.github.ddth.id.SerialIdGenerator;
import com.github.ddth.id.cassandra.CassandraIdGenerator;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test case for {@link CassandraIdGenerator}
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since 0.5.0
 */
public class TestCassandraIdGenerator extends BaseTest {

    public static Test suite() {
        return new TestSuite(TestCassandraIdGenerator.class);
    }

    private class MyCassandraIdGenerator extends CassandraIdGenerator {
        public void initData() {
            Session session = getSession();
            CqlUtils.execute(session, "TRUNCATE " + getTableName(), ConsistencyLevel.ALL);
            CqlUtils.execute(
                    session, "UPDATE " + getTableName() + " SET " + getTableColumnValue()
                            + "=0 WHERE " + getTableColumnName() + "='" + NAMESPACE + "'",
                    ConsistencyLevel.ALL);
        }
    }

    @Override
    protected SerialIdGenerator createSerialIdGenerator() {
        if (System.getProperty("enableTestsCassandra") == null) {
            return null;
        }

        String hostsAndPorts = System.getProperty("hostsAndPorts");
        if (StringUtils.isBlank(hostsAndPorts)) {
            hostsAndPorts = "localhost:9042";
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
        idGen.initData();
        return idGen;
    }
}
