package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);
    }

    public void goToGoodMemoriesActivity(View view){
//        EditText editTextMemory = (EditText) findViewById(R.id.editTextMemoryInput);
//        String memorySaved = editTextMemory.getText().toString();
        Intent goToActivity = new Intent(NewEntryActivity.this, GoodMemoriesActivity.class);
//        goToActivity.putExtra("input", memorySaved;
        startActivity(goToActivity);
    }
}
