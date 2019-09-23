package com.example.anti_nab;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RunningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_running);
    }
    public void refugee(View v){
        Intent i = new Intent(this,RefugeeActivity.class);
        startActivity(i);
    }
    public void parents(View v){
        Intent i = new Intent(this,ParentsActivity.class);
        startActivity(i);
    }
    public void marriage(View view){
        Intent i = new Intent(this,MarriageActivity.class);
        startActivity(i);
    }
}
