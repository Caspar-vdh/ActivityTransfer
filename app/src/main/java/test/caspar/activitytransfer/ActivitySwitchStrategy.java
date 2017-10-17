package test.caspar.activitytransfer;

import android.app.Activity;
import android.content.Intent;

public final class ActivitySwitchStrategy {

    public static void switchToActivity(Activity currentActivity) {
        final Class activityClass;
        if (currentActivity instanceof FirstActivity) {
            activityClass = SecondActivity.class;
        } else {
            activityClass = FirstActivity.class;
        }
        Intent intent = new Intent(currentActivity, activityClass);
        currentActivity.startActivity(intent);
        currentActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
