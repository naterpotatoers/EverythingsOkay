package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class GoodThingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_thing);
    }

    public void goToAllGoodThingActivity(View view){
        Intent goToActivity = new Intent(GoodThingActivity.this,AllGoodThingsActivity.class);
        final TextInputEditText text = (TextInputEditText) findViewById(R.id.textInputEditText15);
        goToActivity.putExtra("Input", text.getText().toString());
        startActivity(goToActivity);
    }
}
