package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonFW, buttonSW, buttonBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFW = findViewById(R.id.buttonFW);
        buttonSW = findViewById(R.id.buttonSW);
        buttonBT = findViewById(R.id.buttonBT);

        View.OnClickListener onClickListenerFW = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fw = new Intent(".FirstWeek");
                startActivity(fw);
            }
        };

        View.OnClickListener onClickListenerSW = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sw = new Intent(".SecondWeek");
                startActivity(sw);
            }
        };

        View.OnClickListener onClickListenerBT = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt = new Intent(".BellsTime");
                startActivity(bt);
            }
        };

        buttonFW.setOnClickListener(onClickListenerFW);
        buttonSW.setOnClickListener(onClickListenerSW);
        buttonBT.setOnClickListener(onClickListenerBT);
    }
}
