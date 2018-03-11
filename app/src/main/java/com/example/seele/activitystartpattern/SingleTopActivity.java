package com.example.seele.activitystartpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTopActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String TAG = SingleTopActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        getSupportActionBar().setTitle("SingleTopActivity");
        ActivityTaskUtils.printActivityTask(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.single_top:
                startActivity(new Intent(SingleTopActivity.this,SingleTopActivity.class));
                break;
            case R.id.single2_task:
                startActivity(new Intent(SingleTopActivity.this,SingleTask2Activity.class));
                break;
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
        ActivityTaskUtils.printActivityTask(this);
    }
}
