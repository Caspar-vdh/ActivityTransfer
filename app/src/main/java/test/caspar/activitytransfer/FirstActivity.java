package test.caspar.activitytransfer;

import android.os.Bundle;

public class FirstActivity extends TransferActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
}
