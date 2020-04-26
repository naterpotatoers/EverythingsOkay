package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);
    }

    public void goToGoodMemoriesActivity(View view){
        Intent goToActivity = new Intent(NewEntryActivity.this, GoodMemoriesActivity.class);
        startActivity(goToActivity);
    }
}
