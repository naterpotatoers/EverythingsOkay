package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SmellActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smell);
    }

    public void goToGoodThingActivity(View view){
        Intent goToActivity = new Intent(SmellActivity.this,GoodThingActivity.class);
        startActivity(goToActivity);
    }
}
