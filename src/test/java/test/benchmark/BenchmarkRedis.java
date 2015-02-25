package test.benchmark;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.RedisIdGenerator;
import com.github.ddth.redis.PoolConfig;

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

        String redisHost = System.getProperty("redisHost");
        if (StringUtils.isBlank(redisHost)) {
            redisHost = "localhost";
        }
        int redisPort;
        try {
            redisPort = Integer.parseInt(System.getProperty("redisPort"));
        } catch (Exception e) {
            redisPort = 6379;
        }

        System.out.println("Num runs: " + numRuns + " / Num threads: " + numThreads
                + " / Num namespaces: " + numNamespaces);
        System.out.println("Redis host: " + redisHost + " / Redis port: " + redisPort);

        RedisIdGenerator.invalidate();
        final PoolConfig poolConfig = new PoolConfig();
        poolConfig.setMaxActive(8192).setTestOnBorrow(true);
        final RedisIdGenerator idGenerator = RedisIdGenerator.getInstance(redisHost, redisPort,
                poolConfig);

        initValues(idGenerator, numNamespaces);

        for (int i = 0; i < 10; i++) {
            runTest(idGenerator, numRuns, numThreads, numNamespaces, "Redis");
        }

        printValues(idGenerator, numNamespaces);

        idGenerator.destroy();
    }
}
