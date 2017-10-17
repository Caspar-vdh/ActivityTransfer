package test.caspar.activitytransfer;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import test.caspar.activitytransfer.test.TestListener;

/*
 * Copyright (C) 2017. TomTom International BV. All rights reserved.
 */
public abstract class TransferActivity extends AppCompatActivity {

    public void switchActivity(View view) {
        TestListener.INSTANCE.reset();
        ActivitySwitchStrategy.switchToActivity(this);
    }

    @Override
    public void onEnterAnimationComplete() {
        TestListener.INSTANCE.onActivityFadedIn(this);
    }
}
