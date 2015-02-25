package test.benchmark;

import org.apache.commons.lang3.StringUtils;

import com.github.ddth.id.ZookeeperIdGenerator;

public class BenchmarkZookeeper extends BaseBenchmarkSerialId {

    public static void main(String[] args) {
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

        String zkConnString = System.getProperty("zkConnStr");
        if (StringUtils.isBlank(zkConnString)) {
            zkConnString = "localhost:2181/id-server";
        }

        System.out.println("Num runs: " + numRuns + " / Num threads: " + numThreads
                + " / Num namespaces: " + numNamespaces);
        System.out.println("ZK: " + zkConnString);

        ZookeeperIdGenerator.invalidate();
        final ZookeeperIdGenerator idGenerator = ZookeeperIdGenerator.getInstance(zkConnString);

        initValues(idGenerator, numNamespaces);

        for (int i = 0; i < 10; i++) {
            runTest(idGenerator, numRuns, numThreads, numNamespaces, "Zookeeper");
        }

        printValues(idGenerator, numNamespaces);

        idGenerator.destroy();
    }
}
