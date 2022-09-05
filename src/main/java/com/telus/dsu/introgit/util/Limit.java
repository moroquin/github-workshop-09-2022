package com.telus.dsu.introgit.util;

public class Limit {
    private final int lowerLimit;
    private final int upperLimit;

    public Limit(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public boolean isInRange(int res) {
        return (res>= this.lowerLimit)&&(res<=this.upperLimit);
    }

    @Override
    public String toString() {
        return "Limit [" + lowerLimit + ", " + upperLimit + "]";
    }

}
