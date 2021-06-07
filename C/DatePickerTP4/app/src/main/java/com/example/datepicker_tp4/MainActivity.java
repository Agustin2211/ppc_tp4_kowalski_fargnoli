package com.example.datepicker_tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker simpleDatePicker = (DatePicker)findViewById(R.id.simpleDatePicker);
        simpleDatePicker.setSpinnersShown(false);
    }

}