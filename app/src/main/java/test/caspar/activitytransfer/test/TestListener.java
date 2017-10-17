package test.caspar.activitytransfer.test;

import android.app.Activity;

/*
 * Copyright (C) 2017. TomTom International BV. All rights reserved.
 */
public interface TestListener {
    TestListener INSTANCE = new EmptyTestListener();

    void onActivityFadedIn(Activity activity);

    void reset();
}
