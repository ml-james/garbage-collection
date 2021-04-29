package jmaitch;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 2)
@Measurement(iterations = 5)
public class CollectionsTest
{
    final Collections collections = new Collections();

    @Benchmark
    @OperationsPerInvocation(10)
    public void fillArray()
    {
        final Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }
    }

    @Benchmark
    @OperationsPerInvocation(10)
    public void readArray(Blackhole bh)
    {
        final Integer[] filledArray = collections.getPrimedArray();
        for (final Integer integer : filledArray) {
            bh.consume(integer);
        }
    }

    @Benchmark
    @OperationsPerInvocation(10)
    public void fillList()
    {
        final List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            arrayList.add(i);
        }
    }

    @Benchmark
    @OperationsPerInvocation(10)
    public void readList(Blackhole bh)
    {
        final List<Integer> filledList = collections.getPrimedList();
        for (final Integer integer : filledList)
        {
            bh.consume(filledList.get(integer));
        }
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