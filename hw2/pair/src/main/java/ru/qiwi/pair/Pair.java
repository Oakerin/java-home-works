package ru.qiwi.pair;

public class Pair<One, Two> {

    private final One first;
    private final Two second;

    private Pair(One first, Two second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair<T, V> of(T first, V second) {
        return new Pair<>(first, second);
    }

    public One getFirst() {
        return this.first;
    }

    public Two getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<One, Two> pair = (Pair) o;
        return compareTwoItems(this.first, pair.first) && compareTwoItems(this.second, pair.second);
    }

    private <T, V> boolean compareTwoItems(T o, V t) {
        if (o != null) {
            return o.equals(t);
        }
        return o == t;
    }
}
