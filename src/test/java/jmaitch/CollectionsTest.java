package jmaitch;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
@Warmup(iterations = 3)
@Measurement(iterations = 8)
public class CollectionsTest
{
    final Collections collections = new Collections();

    @Benchmark
    public void fillArray()
    {
        collections.fillArray();
    }

    @Benchmark
    public void readArray()
    {
        collections.readArray();
    }

    @Benchmark
    public void fillList()
    {
        collections.fillList();
    }

    @Benchmark
    public void readList()
    {
        collections.readList();
    }

    public static void main(String[] args) throws RunnerException
    {
        Options opt = new OptionsBuilder()
                .include(CollectionsTest.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}