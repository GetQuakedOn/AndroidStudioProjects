package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BellsTime extends AppCompatActivity {
    private TextView firstPair, secondPair, thirdPair, fourthPair, fifthPair, sixthPair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bells_time);

        initTVs();

        firstPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTime("8:30 - 10:05");
            }
        });

        secondPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTime("10:15 - 11:50");
            }
        });

        thirdPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTime("12:20 - 13:55");
            }
        });

        fourthPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTime("14:05 - 15:40");
            }
        });

        fifthPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTime("15:50 - 17:20");
            }
        });

        sixthPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTime("17:30 - 19:05");
            }
        });
    }

    private void showTime(String time) {
        Toast.makeText(getBaseContext(), time, Toast.LENGTH_SHORT).show();
    }

    private void initTVs() {
        firstPair = findViewById(R.id.tv_firstPair);
        secondPair = findViewById(R.id.tv_secondPair);
        thirdPair = findViewById(R.id.tv_thirdPair);
        fourthPair = findViewById(R.id.tv_fourthPair);
        fifthPair = findViewById(R.id.tv_fifthPair);
        sixthPair = findViewById(R.id.tv_sixthPair);
    }
}
