package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class BreatheOutActivity extends AppCompatActivity {
    TextView t1;
    CountDownTimer countDownTimer;
    Timer timer;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathe_out2);
        TextView mainTitle = (TextView) findViewById(R.id.BreatheOutTitle);
        mainTitle.setText("Breathe Out");

        t1 = findViewById(R.id.timer);
        countDownTimer = new CountDownTimer(5000, 1000) {


            @Override
            public void onTick(long millisUntilFinished) {


                t1.setText(millisUntilFinished / 1000 + "");
            }

            @Override
            public void onFinish() {
                t1.setText("0");

            }
        }.start();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(BreatheOutActivity.this, BreathingInActivity.class);
                startActivity(intent);
                finish();

            }
        }, 6000);
    }
}
