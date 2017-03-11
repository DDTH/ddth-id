package com.github.ddth.id.test.benchmark;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.cassandra.CassandraIdGenerator;

public class BenchmarkCassandra extends BaseBenchmarkSerialId {

    public static void main(String[] args) throws SQLException, InterruptedException {
        int numRuns, numThreads, numNamespaces;

        try {
            numRuns = Integer.parseInt(System.getProperty("numRuns"));
        } catch (Exception e) {
            numRuns = 4000;
        }
        try {
            numThreads = Integer.parseInt(System.getProperty("numThreads"));
        } catch (Exception e) {
            numThreads = 8;
        }
        try {
            numNamespaces = Integer.parseInt(System.getProperty("numNamespaces"));
        } catch (Exception e) {
            numNamespaces = 4;
        }

        String hostsAndPorts = System.getProperty("hostsAndPorts"),
                keyspace = System.getProperty("keyspace"), table = System.getProperty("table"),
                user = System.getProperty("user"), password = System.getProperty("password");
        if (StringUtils.isBlank(hostsAndPorts)) {
            hostsAndPorts = "localhost:9042";
        }
        if (StringUtils.isBlank(keyspace)) {
            keyspace = "test";
        }
        if (StringUtils.isBlank(table)) {
            table = "ddth_id";
        }
        if (StringUtils.isBlank(user)) {
            user = "test";
        }
        if (StringUtils.isBlank(password)) {
            password = "test";
        }

        try (CassandraIdGenerator idGen = new CassandraIdGenerator()) {
            idGen.setHostsAndPorts(hostsAndPorts).setKeyspace(keyspace).setTableName(table)
                    .setUser(user).setPassword(password);
            idGen.init();

            initValues(idGen, numNamespaces);

            for (int i = 0; i < 10; i++) {
                runTest(idGen, numRuns, numThreads, numNamespaces, "Cassandra");
                // System.out.println("\tCurrent: " +
                // idGen.TIMEOUT_CURRRENT_ID.get());
                // System.out.println("\tNext : " +
                // idGen.TIMEOUT_NEXT_ID.get());
                // System.out.println("\tSet : " + idGen.TIMEOUT_SET_ID.get());
            }

            printValues(idGen, numNamespaces);
        }
    }
}
