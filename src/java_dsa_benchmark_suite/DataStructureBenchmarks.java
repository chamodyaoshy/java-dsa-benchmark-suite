package java_dsa_benchmark_suite;

import java.util.*;

public class DataStructureBenchmarks {

    public static BenchmarkResult benchmarkSetInsert(String type, int size) {
        Set<Integer> set = type.equals("HashSet") ? new HashSet<>() : new TreeSet<>();
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            set.add((i * 7919) % (size * 2));
        }
        long end = System.nanoTime();
        return new BenchmarkResult("Data Structure", type + " Insert", size, (end - start) / 1_000_000.0, "add() loop");
    }

    public static BenchmarkResult benchmarkSetLookup(String type, int size) {
        Set<Integer> set = type.equals("HashSet") ? new HashSet<>() : new TreeSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        long start = System.nanoTime();
        int found = 0;
        for (int i = 0; i < size; i += 2) {
            if (set.contains(i)) found++;
        }
        long end = System.nanoTime();
        return new BenchmarkResult("Data Structure", type + " Lookup", size, (end - start) / 1_000_000.0, "matched=" + found);
    }
}