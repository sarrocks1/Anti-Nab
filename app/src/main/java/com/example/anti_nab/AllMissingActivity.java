package com.example.anti_nab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AllMissingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_all_missing);
    }
}