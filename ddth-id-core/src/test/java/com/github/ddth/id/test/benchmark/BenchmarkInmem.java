package com.github.ddth.id.test.benchmark;

import java.sql.SQLException;

import com.github.ddth.id.InmemIdGenerator;

public class BenchmarkInmem extends BaseBenchmarkSerialId {

    public static void main(String[] args) throws SQLException, InterruptedException {
        int numRuns, numThreads, numNamespaces;

        try {
            numRuns = Integer.parseInt(System.getProperty("numRuns"));
        } catch (Exception e) {
            numRuns = 512000;
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

        try (InmemIdGenerator idGen = new InmemIdGenerator()) {
            idGen.init();

            initValues(idGen, numNamespaces);

            for (int i = 0; i < 10; i++) {
                runTest(idGen, numRuns, numThreads, numNamespaces, "Cassandra");
            }

            printValues(idGen, numNamespaces);
        }
    }
}
