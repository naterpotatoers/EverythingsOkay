package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThoughtJournalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thought_journal);
    }

    public void goToNewEntryActivity(View view){
        Intent goToActivity = new Intent(ThoughtJournalActivity.this,NewEntryActivity.class);
        startActivity(goToActivity);
    }

    public void goToGoodMemoriesActivity(View view){
        Intent goToActivity = new Intent(ThoughtJournalActivity.this, GoodMemoriesActivity.class);
        startActivity(goToActivity);
    }
}