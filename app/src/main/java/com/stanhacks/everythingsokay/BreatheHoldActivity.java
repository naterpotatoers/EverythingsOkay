package com.stanhacks.everythingsokay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class BreatheHoldActivity extends AppCompatActivity {
    TextView t1;
    CountDownTimer countDownTimer;
    Timer timer;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathe_hold);
      TextView mainTitle = (TextView) findViewById(R.id.BreatheHoldTitle);
       mainTitle.setText("Hold Your Breath");

        t1 = findViewById(R.id.timer);
        countDownTimer = new CountDownTimer(6000, 1000) {


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
                Intent intent = new Intent(BreatheHoldActivity.this, BreatheOutActivity.class);
                startActivity(intent);
                finish();

            }
        }, 7000);

    }
}

