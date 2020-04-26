package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GoodMemoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_memories);
    }

    public void goToMainActivity(View view){
        Intent goToActivity = new Intent(GoodMemoriesActivity.this, MainActivity.class);
        startActivity(goToActivity);
    }
}
