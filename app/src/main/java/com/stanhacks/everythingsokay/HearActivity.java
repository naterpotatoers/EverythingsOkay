package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hear);
    }

    public void goToSmellActivity(View view){
        Intent goToActivity = new Intent(HearActivity.this,SmellActivity.class);
        startActivity(goToActivity);
    }
}
