package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FeelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feel);
    }

    public void goToHearActivity(View view){
        Intent goToActivity = new Intent(FeelActivity.this,HearActivity.class);
        startActivity(goToActivity);
    }
}
