package com.github.ddth.id.test.benchmark;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.redis.RedisIdGenerator;

public class BenchmarkRedis extends BaseBenchmarkSerialId {

    public static void main(String[] args) {
        int numRuns, numThreads, numNamespaces;

        try {
            numRuns = Integer.parseInt(System.getProperty("numRuns"));
        } catch (Exception e) {
            numRuns = 100000;
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

        String redisHostAndPort = System.getProperty("redisHostAndPort");
        if (StringUtils.isBlank(redisHostAndPort)) {
            redisHostAndPort = "localhost:6379";
        }

        String redisPassword = System.getProperty("redisPassword");
        if (StringUtils.isBlank(redisHostAndPort)) {
            redisPassword = null;
        }

        System.out.println("Num runs: " + numRuns + " / Num threads: " + numThreads
                + " / Num namespaces: " + numNamespaces);
        System.out.println("Redis host: " + redisHostAndPort);

        try (RedisIdGenerator idGen = RedisIdGenerator.getInstance(redisHostAndPort,
                redisPassword)) {
            initValues(idGen, numNamespaces);

            for (int i = 0; i < 10; i++) {
                runTest(idGen, numRuns, numThreads, numNamespaces, "Redis");
            }

            printValues(idGen, numNamespaces);
        }
    }
}
