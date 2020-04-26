package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class BreathingInActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    CountDownTimer countDownTimer;
    Timer timer;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing_in);
        TextView mainTitle = (TextView) findViewById(R.id.BreatheInTitle);
        mainTitle.setText("Breathe In");

        b1 = findViewById(R.id.buttonBegin);
        t1 = findViewById(R.id.timer);

        countDownTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                t1.setText(millisUntilFinished / 1000 + "");
            }

            @Override
            public void onFinish() {
                t1.setText("0");
                Intent intent = new Intent(BreathingInActivity.this, BreatheHoldActivity.class);
                startActivity(intent);
                //Toast.makeText(BreathingInActivity.this, "Next", Toast.LENGTH_SHORT).show();
            }
        };

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(BreathingInActivity.this, "start", Toast.LENGTH_SHORT).show();
                countDownTimer.start();


            }

        });
       // timer = new Timer();
        //timer.schedule(new TimerTask() {
            //@Override
            //public void run() {
          //      Intent intent = new Intent(BreathingInActivity.this, BreatheHoldActivity.class);
              //  startActivity(intent);
                //finish();

           // }
        //}, 6000);

    }

    public void goToMainActivity(View view) {
        Intent goToActivity = new Intent(BreathingInActivity.this, MainActivity.class);
        startActivity(goToActivity);
    }

}



