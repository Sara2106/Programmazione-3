package org.prog3.lab.week8.main;

public class ActivityCounter {
    int counter;

    public ActivityCounter() {
        counter = 0;
    }

    synchronized void incrementCounter() {
        counter++;
    }

    @Override
    public String toString() {
        return String.valueOf(counter);
    }
}
