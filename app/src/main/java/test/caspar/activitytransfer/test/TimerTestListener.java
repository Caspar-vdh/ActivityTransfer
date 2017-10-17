package test.caspar.activitytransfer.test;

import android.app.Activity;
import android.widget.Toast;

import test.caspar.activitytransfer.ActivitySwitchStrategy;

/*
 * Copyright (C) 2017. TomTom International BV. All rights reserved.
 */
public class TimerTestListener implements TestListener {
    private static final int MAX_ITERATIONS = 100;

    private int currentIteration = -1;
    private long startTime;

    @Override
    public void onActivityFadedIn(Activity activity) {
        if (currentIteration > MAX_ITERATIONS) {
            return;
        }

        if (currentIteration == MAX_ITERATIONS) {
            // test terminated
            Toast.makeText(activity,
                    "Test:\nIterations: " + MAX_ITERATIONS + "\nTime      : " + (System.currentTimeMillis() - startTime),
                    Toast.LENGTH_LONG).show();
        } else {
            if (currentIteration == -1) {
                // test starting
                startTime = System.currentTimeMillis();
            }
            ActivitySwitchStrategy.switchToActivity(activity);
        }
        currentIteration++;
    }

    @Override
    public void reset() {
        currentIteration = -1;
    }
}
