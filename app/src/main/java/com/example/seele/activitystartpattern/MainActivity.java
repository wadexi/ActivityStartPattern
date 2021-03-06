package com.example.seele.activitystartpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("MainActivity");
        ActivityTaskUtils.printActivityTask(this);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,SingleTopActivity.class));
    }
}
