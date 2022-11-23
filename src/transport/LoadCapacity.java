package transport;

public enum LoadCapacity {
    N1(0d, 3.5),
    N2(3.5,12d ),
    N3(12d, null);

    private final Double from;
    private final Double before;
    LoadCapacity(Double from, Double before) {
        this.from = from;
        this.before = before;
    }

    public Double getFrom() {
        return from;
    }

    public Double getBefore() {
        return before;
    }
}
