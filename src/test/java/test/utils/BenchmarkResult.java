package test.utils;

import com.yammer.metrics.core.Histogram;
import com.yammer.metrics.stats.Snapshot;

public class BenchmarkResult {
    private final int count;
    private final double rate;
    private final long totalTime;
    private final double minTime;
    private final double maxTime;
    private final double meanTime;
    private final double deviation;
    private final double p75Time;
    private final double p95Time;

    public BenchmarkResult(int count, long totalTime, Histogram histogram) {
        this.count = count;
        this.totalTime = totalTime;
        this.rate = count / (totalTime * 1.0);
        this.minTime = histogram.min();
        this.maxTime = histogram.max();
        this.meanTime = histogram.mean();
        this.deviation = histogram.stdDev();
        Snapshot snapshot = histogram.getSnapshot();
        this.p75Time = snapshot.get75thPercentile();
        this.p95Time = snapshot.get95thPercentile();
    }

    public String summarize() {
        return String
                .format("Completed %d ops in %.3f secs (~%.3f ops/sec), op time: %.2f/%.2f/%.2f/%.2f/%.2f (ms)",
                        count, totalTime / 1E3, rate * 1E3, minTime, maxTime, meanTime, p75Time,
                        p95Time);
    }

    public int getCount() {
        return count;
    }

    public double getRate() {
        return rate;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public double getMinTime() {
        return minTime;
    }

    public double getMaxTime() {
        return maxTime;
    }

    public double getMeanTime() {
        return meanTime;
    }

    public double getDeviation() {
        return deviation;
    }

    public double getP75Time() {
        return p75Time;
    }

    public double getP95Time() {
        return p95Time;
    }

}
