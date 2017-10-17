package test.caspar.activitytransfer.test;

import android.app.Activity;

/*
 * Copyright (C) 2017. TomTom International BV. All rights reserved.
 */
public class EmptyTestListener implements TestListener {
    @Override
    public void onActivityFadedIn(Activity activity) {
        // do nothing
    }

    @Override
    public void reset() {

    }
}
