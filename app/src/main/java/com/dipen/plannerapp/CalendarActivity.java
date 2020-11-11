package com.dipen.plannerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class CalendarActivity extends AppCompatActivity {
    DatePicker simpleDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        simpleDate = findViewById(R.id.simpleCalendar);

        Calendar cal = Calendar.getInstance();
            simpleDate.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),
                    new DatePicker.OnDateChangedListener() {
                        @Override
                        public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            Toast.makeText(CalendarActivity.this,"Date:-" + simpleDate.getDayOfMonth()
                            + "\n" + "Month:-" + (simpleDate.getMonth()+1)+ "\n" + "Year:-" + simpleDate.getYear(),
                        Toast.LENGTH_SHORT).show();
                        }
                    });
    }
}