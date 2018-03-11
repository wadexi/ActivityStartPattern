package com.example.seele.activitystartpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SingleTop2Activity extends AppCompatActivity {
    public static final String TAG = SingleTop2Activity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top2);
        getSupportActionBar().setTitle("SingleTop2Activity");
        ActivityTaskUtils.printActivityTask(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
        ActivityTaskUtils.printActivityTask(this);
    }
}
