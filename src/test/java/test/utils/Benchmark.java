package test.utils;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Histogram;

public class Benchmark {
    private final Operation operation;
    private final int concurrentLevel;
    private final int numberOfRun;
    private final CyclicBarrier barrier;
    private final Histogram histogram;

    public Benchmark(Operation operation, int numberOfRun, int concurrentLevel) {
        this.operation = operation;
        this.concurrentLevel = concurrentLevel;
        this.numberOfRun = numberOfRun;
        this.barrier = new CyclicBarrier(concurrentLevel + 1);
        this.histogram = Metrics.newHistogram(Benchmark.class,
                "operation-histogram" + System.nanoTime());
    }

    private class Worker implements Runnable {
        final int first;
        final int length;

        public Worker(int first, int length) {
            this.first = first;
            this.length = length;
        }

        @Override
        public void run() {
            for (int i = 0; i < length; i++) {
                long before = System.currentTimeMillis();
                operation.run(first + i);
                histogram.update(System.currentTimeMillis() - before);
            }
            try {
                barrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public BenchmarkResult run() {
        int opsPerWorker = (int) Math.floor(numberOfRun / concurrentLevel);
        long before = System.currentTimeMillis();
        for (int i = 0; i < concurrentLevel; i++) {
            int first = i * opsPerWorker;
            int length = opsPerWorker;
            if (first + length > numberOfRun)
                length = numberOfRun - first;
            new Thread(new Worker(first, length)).start();
        }

        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        long totalTime = System.currentTimeMillis() - before;
        return new BenchmarkResult(numberOfRun, totalTime, histogram);
    }

}
