package com.example.anti_nab;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_first);
    }
    public void whyrun(View v){
        Intent i = new Intent(this,RunningActivity.class);
        startActivity(i);
    }
    public void missing(View v){
        Intent i = new Intent(this,MissingActivity.class);
        startActivity(i);
    }
    public void allmissing(View v){
        Intent i = new Intent(this,AllMissingActivity.class);
        startActivity(i);
    }
}
