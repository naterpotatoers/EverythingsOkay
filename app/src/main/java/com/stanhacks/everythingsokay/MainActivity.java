package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainTitle = (TextView) findViewById(R.id.textViewAppTitle);
        mainTitle.setText("EverythingsOkay");
    }
    public void goToThoughtJournalActivity(View view) {
        Intent goToActivity = new Intent(MainActivity.this,ThoughtJournalActivity.class);
        startActivity(goToActivity);
    }

    public void goToGroundingExerciseActivity(View view){
        Intent goToActivity = new Intent(MainActivity.this,GroundingExerciseActivity.class);
        startActivity(goToActivity);
    }

    public void goToBreathingInActivity (View view){
        Intent goToActivity = new Intent(MainActivity.this,BreathingInActivity.class);
        startActivity(goToActivity);
    }
}
