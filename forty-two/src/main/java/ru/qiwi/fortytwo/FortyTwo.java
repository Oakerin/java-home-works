package ru.qiwi.fortytwo;

public class FortyTwo extends Number implements Comparable<FortyTwo>, TheUltimateQuestionOfLifeTheUniverseAndEverything {

    public final int value = 42;

    @Override
    public int intValue() {
        return 42;
    }

    @Override
    public long longValue() {
        return 42L;
    }

    @Override
    public float floatValue() {
        return 42f;
    }

    @Override
    public double doubleValue() {
        return 42d;
    }

    @Override
    public int compareTo(FortyTwo o) {
        if (this.value > o.value) {
            return 1;
        } else if (this.value < o.value) {
            return -1;
        }
        return 0;
    }


    @Override
    public void getAnswer() {
        System.out.print(this.value);
    }
}
