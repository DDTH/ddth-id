package com.github.ddth.id.test.benchmark;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.jdbc.JdbcIdGenerator;

public class BenchmarkPgsql extends BaseBenchmarkSerialId {

    public static void main(String[] args) throws SQLException {
        int numRuns, numThreads, numNamespaces;

        try {
            numRuns = Integer.parseInt(System.getProperty("numRuns"));
        } catch (Exception e) {
            numRuns = 32000;
        }
        try {
            numThreads = Integer.parseInt(System.getProperty("numThreads"));
        } catch (Exception e) {
            numThreads = 4;
        }
        try {
            numNamespaces = Integer.parseInt(System.getProperty("numNamespaces"));
        } catch (Exception e) {
            numNamespaces = 4;
        }

        String jdbcUrl = System.getProperty("jdbcUrl"), jdbcUser = System.getProperty("jdbcUser"),
                jdbcPassword = System.getProperty("jdbcPassword");
        if (StringUtils.isBlank(jdbcUrl)) {
            jdbcUrl = "jdbc:postgresql://localhost:5432/temp";
        }
        if (StringUtils.isBlank(jdbcUser)) {
            jdbcUser = "test";
        }
        if (StringUtils.isBlank(jdbcPassword)) {
            jdbcPassword = "test";
        }

        try (JdbcIdGenerator idGen = new JdbcIdGenerator()) {
            idGen.setJdbcDriverClass("postgresql").setJdbcUrl(jdbcUrl).setJdbcUser(jdbcUser)
                    .setJdbcPassword(jdbcPassword);
            idGen.setTableName("ddth_id").init();

            initValues(idGen, numNamespaces);

            for (int i = 0; i < 10; i++) {
                runTest(idGen, numRuns, numThreads, numNamespaces, "PgSQL");
            }

            printValues(idGen, numNamespaces);
        }
    }
}
