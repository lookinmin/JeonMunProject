package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class hw6_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw61);
        setTitle("시간 예약");

        Chronometer chrono = findViewById(R.id.chronometer1);
        Button btnStart = findViewById(R.id.btnStart);
        RadioButton rdoCal = findViewById(R.id.rdoCal);
        RadioButton rdoTime = findViewById(R.id.rdoTime);
        CalendarView calView = findViewById(R.id.calendarView1);
        TimePicker tPicker = findViewById(R.id.timePicker1);
        Button btnEnd = findViewById(R.id.btnEnd);
        TextView tvYear = findViewById(R.id.tvYear);
        TextView tvMonth = findViewById(R.id.tvMonth);
        TextView tvDay = findViewById(R.id.tvDay);
        TextView tvHour = findViewById(R.id.tvHour);
        TextView tvMinute = findViewById(R.id.tvMinute);

        tPicker.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

    }
}