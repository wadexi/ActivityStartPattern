package com.example.seele.activitystartpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTask3Activity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = SingleTask3Activity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task3);
        getSupportActionBar().setTitle("SingleTask3Activity");
        ActivityTaskUtils.printActivityTask(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
        ActivityTaskUtils.printActivityTask(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(SingleTask3Activity.this,SingleTask2Activity.class));
    }
}
