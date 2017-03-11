package com.github.ddth.id.test.benchmark;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.zookeeper.ZookeeperIdGenerator;

public class BenchmarkZookeeper extends BaseBenchmarkSerialId {

    private static class MyZkIdGenerator extends ZookeeperIdGenerator {
        public void initData(int numNamespaces) {
            for (int i = 0; i < numNamespaces; i++) {
                setValueWithRetries(String.valueOf(i), 0, 5, TimeUnit.SECONDS);
            }
        }
    }

    public static void main(String[] args) {
        int numRuns, numThreads, numNamespaces;

        try {
            numRuns = Integer.parseInt(System.getProperty("numRuns"));
        } catch (Exception e) {
            numRuns = 2000;
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

        String zkConnString = System.getProperty("zkConnStr");
        if (StringUtils.isBlank(zkConnString)) {
            zkConnString = "localhost:2181/ddth-id";
        }

        System.out.println("Num runs: " + numRuns + " / Num threads: " + numThreads
                + " / Num namespaces: " + numNamespaces);
        System.out.println("ZK: " + zkConnString);

        try (MyZkIdGenerator idGen = new MyZkIdGenerator()) {
            idGen.setZookeeperConnString(zkConnString);
            idGen.init();
            idGen.initData(numNamespaces);

            initValues(idGen, numNamespaces);

            for (int i = 0; i < 10; i++) {
                runTest(idGen, numRuns, numThreads, numNamespaces, "ZooKeeper");
            }

            printValues(idGen, numNamespaces);
        }
    }
}
