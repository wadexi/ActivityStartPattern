package com.example.seele.activitystartpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SingleTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        getSupportActionBar().setTitle("SingleTaskActivity");
        ActivityTaskUtils.printActivityTask(this);
    }
}
