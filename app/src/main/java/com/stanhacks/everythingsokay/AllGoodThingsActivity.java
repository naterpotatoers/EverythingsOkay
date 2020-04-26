package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AllGoodThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_good_things);
        Intent extraIntentInfo = getIntent();
        String name = extraIntentInfo.getStringExtra("Input");
        TextView text = (TextView) findViewById(R.id.textInput);
        text.setText(name);
    }

    public void goToMainActivity(View view){
        Intent goToActivity = new Intent(AllGoodThingsActivity.this,MainActivity.class);
        startActivity(goToActivity);
    }
}
