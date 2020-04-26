package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GoodThingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_thing);
    }

    public void goToAllGoodThingActivity(View view){
        Intent goToActivity = new Intent(GoodThingActivity.this,AllGoodThingsActivity.class);
        EditText text = (EditText) findViewById(R.id.editTextAboutSelf);
        goToActivity.putExtra("Input", text.getText().toString());
        startActivity(goToActivity);
    }
}
