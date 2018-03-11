package com.example.seele.activitystartpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTask2Activity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = SingleTask2Activity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task2);
        getSupportActionBar().setTitle("SingleTask2Activity");
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
        switch (v.getId()){
            case R.id.single3_task:
                startActivity(new Intent(SingleTask2Activity.this,SingleTask3Activity.class));
                break;
            case R.id.single_instance:
                startActivity(new Intent(SingleTask2Activity.this,SingleInstanceActivity.class));
                break;
        }
    }
}
