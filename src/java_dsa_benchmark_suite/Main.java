package java_dsa_benchmark_suite;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 10_000;
        int[] sampleData = BenchmarkRunner.generateRandomArray(size, 42L);

        List<BenchmarkResult> results = new ArrayList<>();

        results.add(BenchmarkRunner.measureSort("Bubble Sort", sampleData, SortingAlgorithms::bubbleSort));
        results.add(BenchmarkRunner.measureSort("Insertion Sort", sampleData, SortingAlgorithms::insertionSort));
        results.add(BenchmarkRunner.measureSort("Merge Sort", sampleData, SortingAlgorithms::mergeSort));
        results.add(BenchmarkRunner.measureSort("Quick Sort", sampleData, SortingAlgorithms::quickSort));

        int dsSize = 50_000;
        results.add(DataStructureBenchmarks.benchmarkSetInsert("HashSet", dsSize));
        results.add(DataStructureBenchmarks.benchmarkSetInsert("TreeSet", dsSize));
        results.add(DataStructureBenchmarks.benchmarkSetLookup("HashSet", dsSize));
        results.add(DataStructureBenchmarks.benchmarkSetLookup("TreeSet", dsSize));

        BenchmarkRunner.printResults(results);
    }
}