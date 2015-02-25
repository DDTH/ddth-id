package test.benchmark;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import test.utils.Benchmark;
import test.utils.BenchmarkResult;
import test.utils.Operation;

import com.github.ddth.id.SerialIdGenerator;

public class BaseBenchmarkSerialId {

    protected static void initValues(final SerialIdGenerator idGenerator, final int numNamespaces) {
        for (int i = 0; i < numNamespaces; i++) {
            String namespace = String.valueOf(i);
            idGenerator.setValue(namespace, 0);
        }
    }

    protected static void printValues(final SerialIdGenerator idGenerator, final int numNamespaces) {
        for (int i = 0; i < numNamespaces; i++) {
            String namespace = String.valueOf(i);
            System.out.println(namespace + ": " + idGenerator.currentId(namespace));
        }
    }

    @SuppressWarnings("unchecked")
    protected static void runTest(final SerialIdGenerator idGenerator, final int numRuns,
            final int numThreads, final int numNamespaces, final String engine) {
        final Map<Long, Long>[] idMaps = new Map[numNamespaces];
        for (int i = 0; i < numNamespaces; i++) {
            idMaps[i] = new ConcurrentHashMap<Long, Long>();
        }

        BenchmarkResult result = new Benchmark(new Operation() {
            @Override
            public void run(int runId) {
                int idxNamespace = runId % numNamespaces;
                String namespace = String.valueOf(idxNamespace);
                try {
                    Long id = idGenerator.nextId(namespace);
                    if (id.longValue() <= 0 || idMaps[idxNamespace].containsKey(id)) {
                        System.out.println("Error: " + id);
                    }
                    idMaps[idxNamespace].put(id, id);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, numRuns, numThreads).run();
        System.out.println("[" + engine + "]:\t" + result.summarize());
    }
}
