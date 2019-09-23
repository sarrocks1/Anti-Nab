package com.example.anti_nab;

import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;


public class FullscreenActivity extends AppCompatActivity{
    int SPLASH = 3000;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_fullscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(FullscreenActivity.this,FirstActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH);
    }

}
