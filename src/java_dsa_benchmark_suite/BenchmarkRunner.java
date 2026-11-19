package java_dsa_benchmark_suite;

import java.util.*;
import java.util.function.Function;

public class BenchmarkRunner {

    public static int[] generateRandomArray(int size, long seed) {
        Random rand = new Random(seed);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10);
        }
        return arr;
    }

    public static BenchmarkResult measureSort(String name, int[] data, Function<int[], int[]> sortFn) {
        long start = System.nanoTime();
        int[] sorted = sortFn.apply(data);
        long end = System.nanoTime();

        boolean valid = isSorted(sorted);
        return new BenchmarkResult(
            "Sorting",
            name,
            data.length,
            (end - start) / 1_000_000.0,
            valid ? "Sorted OK" : "Sort Error!"
        );
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    public static void printResults(List<BenchmarkResult> results) {
        System.out.printf("%-16s | %-22s | %8s | %12s | %-15s%n",
                "Category", "Algorithm / Op", "Size (N)", "Time (ms)", "Notes");
        System.out.println("----------------------------------------------------------------------------------------");
        for (BenchmarkResult r : results) {
            System.out.printf("%-16s | %-22s | %8d | %12.3f | %-15s%n",
                    r.getCategory(), r.getName(), r.getDatasetSize(), r.getDurationMs(), r.getNotes());
        }
    }
}