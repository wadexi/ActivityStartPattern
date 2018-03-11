package com.example.seele.activitystartpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleInstance2Activity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = SingleInstance2Activity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance2);
        getSupportActionBar().setTitle("SingleInstance2Activity");
        ActivityTaskUtils.printActivityTask(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(SingleInstance2Activity.this,SingleInstanceActivity.class));
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
        ActivityTaskUtils.printActivityTask(this);
    }
}
