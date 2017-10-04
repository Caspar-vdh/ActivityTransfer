package test.caspar.activitytransfer;

import android.app.Activity;
import android.content.Intent;

public final class ActivitySwitchStrategy {
    public static void switchToActivity(Activity currentActivity, Class activityClass) {
        Intent intent = new Intent(currentActivity, activityClass);
        currentActivity.startActivity(intent);
        currentActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
