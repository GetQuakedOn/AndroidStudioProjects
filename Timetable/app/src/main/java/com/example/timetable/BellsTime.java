package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BellsTime extends AppCompatActivity {
    private TextView firstLesson, secondLesson, thirdLesson, fourthLesson, fifthLesson, sixthLesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bells_time);

        initTVs();

        setOnClickListener(firstLesson, "8:30 - 9:15\n9:20 - 10:05");
        setOnClickListener(secondLesson, "10:15 - 11:00\n11:05 - 11:50");
        setOnClickListener(thirdLesson, "12:20 - 13:05\n13:10 - 13:55");
        setOnClickListener(fourthLesson, "14:10 - 15:20");
        setOnClickListener(fifthLesson, "15:30 - 16:40");
        setOnClickListener(sixthLesson, "16:50 - 18:00");
    }

    private void setOnClickListener(TextView lesson, final String time) {
        lesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTime(time);
            }
        });
    }

    private void showTime(String time) {
        Toast.makeText(getBaseContext(), time, Toast.LENGTH_SHORT).show();
    }

    private void initTVs() {
        firstLesson = findViewById(R.id.tv_firstPair);
        secondLesson = findViewById(R.id.tv_secondPair);
        thirdLesson = findViewById(R.id.tv_thirdPair);
        fourthLesson = findViewById(R.id.tv_fourthPair);
        fifthLesson = findViewById(R.id.tv_fifthPair);
        sixthLesson = findViewById(R.id.tv_sixthPair);
    }
}
