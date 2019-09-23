package com.example.anti_nab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MissingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_missing);

    }
    public void submitted(View v){
        Toast.makeText(this, "FORM SUBMITTED!", Toast.LENGTH_LONG).show();

    }
}
