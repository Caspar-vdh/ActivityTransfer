package test.caspar.activitytransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void switchActivity(View view) {
        ActivitySwitchStrategy.switchToActivity(this, SecondActivity.class);
    }
}
