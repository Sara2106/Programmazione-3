package org.prog3.lab.week8.main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Activity implements Runnable {
    ArrayList<Thread> waitFor;
    int activityNumber;
    int secondsToWait;
    ActivityCounter activityCounter;

    public Activity(int activityNumber, int secondsToWait, ArrayList<Thread> threadToWait, ActivityCounter activityCounter) {
        this.waitFor = new ArrayList<>(threadToWait);
        this.activityNumber = activityNumber;
        this.secondsToWait = secondsToWait;
        this.activityCounter = activityCounter;
    }

    @Override
    public void run() {
        System.out.println("Activity " + activityNumber + " waiting...");

        for(Thread thread: waitFor) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Activity " + activityNumber + " running...");
        System.out.println("Activity counter:" + activityCounter);

        try {
            Thread.sleep(secondsToWait * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        activityCounter.incrementCounter();
        System.out.println("Activity " + activityNumber + " ended.");
    }
}
