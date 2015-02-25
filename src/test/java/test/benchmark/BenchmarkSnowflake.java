package test.benchmark;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import test.utils.Benchmark;
import test.utils.BenchmarkResult;
import test.utils.Operation;

import com.github.ddth.id.SnowflakeIdGenerator;

public class BenchmarkSnowflake {

    private static void runTest(final int numRuns, final int numThreads, final int numNamespaces,
            final String engine) {
        final SnowflakeIdGenerator idGenerator = SnowflakeIdGenerator.getInstance();
        final Map<Long, Long> idMaps = new ConcurrentHashMap<Long, Long>();

        BenchmarkResult result = new Benchmark(new Operation() {
            @Override
            public void run(int runId) {
                try {
                    Long id = idGenerator.generateId64();
                    if (idMaps.containsKey(id)) {
                        System.out.println("Error: " + id);
                    }
                    idMaps.put(id, id);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, numRuns, numThreads).run();
        System.out.println("[" + engine + "]:\t" + result.summarize());
    }

    public static void main(String[] args) {
        int numRuns, numThreads, numNamespaces;

        try {
            numRuns = Integer.parseInt(System.getProperty("numRuns"));
        } catch (Exception e) {
            numRuns = 1000000;
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

        System.out.println("Num runs: " + numRuns + " / Num threads: " + numThreads
                + " / Num namespaces: " + numNamespaces);

        for (int i = 0; i < 10; i++) {
            runTest(numRuns, numThreads, numNamespaces, "Snowflake");
        }
    }
}
