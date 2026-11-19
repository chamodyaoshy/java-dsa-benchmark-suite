# Java DSA Benchmark Suite

A clean, modular Java benchmark tool to measure and compare the runtime performance of sorting algorithms and collection data structures.

## Features
- **Sorting Benchmarks:** Bubble Sort, Insertion Sort, Merge Sort, and Quick Sort on generated integer datasets with automatic sort verification.
- **Data Structure Benchmarks:** `HashSet` vs `TreeSet` insertion and lookup (`contains()`) performance comparisons using `System.nanoTime()`.
- **Formatted Console Output:** Clean table summary displaying category, algorithm/operation, dataset size (`N`), execution time (`ms`), and status notes.

## Project Structure
```text
src/
└── java_dsa_benchmark_suite/
    ├── BenchmarkResult.java
    ├── SortingAlgorithms.java
    ├── DataStructureBenchmarks.java
    ├── BenchmarkRunner.java
    └── Main.java