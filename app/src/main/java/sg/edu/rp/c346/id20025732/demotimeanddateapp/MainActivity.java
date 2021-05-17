package sg.edu.rp.c346.id20025732.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button buttonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Time is";
                int hour = tp.getCurrentHour();
                int min = tp.getCurrentMinute();
                msg = msg + hour + ":" + min;
                tvDisplay.setText(msg);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Date is";
                int date = dp.getDayOfMonth();
                int month = dp.getMonth() + 1;
                int year = dp.getYear();
                msg = msg + ":" + date + "/" + month + "/" + year;
                tvDisplay.setText(msg);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = 00;
                int year = 2021;
                int month = 1;
                int day = 1;
                int min = 00;
                dp.updateDate(year,month,day);
                tp.setCurrentHour(hour);
                tp.setCurrentMinute(min);
            }
        });
    }
}