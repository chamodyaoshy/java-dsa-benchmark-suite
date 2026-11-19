package java_dsa_benchmark_suite;

public class BenchmarkResult {
    private final String category;
    private final String name;
    private final int datasetSize;
    private final double durationMs;
    private final String notes;

    public BenchmarkResult(String category, String name, int datasetSize, double durationMs, String notes) {
        this.category = category;
        this.name = name;
        this.datasetSize = datasetSize;
        this.durationMs = durationMs;
        this.notes = notes;
    }

    public String getCategory() { return category; }
    public String getName() { return name; }
    public int getDatasetSize() { return datasetSize; }
    public double getDurationMs() { return durationMs; }
    public String getNotes() { return notes; }
}