package com.demo.reservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv_today, tv_year, tv_month, tv_day, tv_hour, tv_minute;
    RadioButton rd_date,rd_time;
    CalendarView cal;
    TimePicker time;
    Button bt_reserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_today = (TextView)findViewById(R.id.tv_today);
        tv_year = (TextView)findViewById(R.id.tv_year);
        tv_month = (TextView)findViewById(R.id.tv_month);
        tv_day = (TextView)findViewById(R.id.tv_day);
        tv_hour = (TextView)findViewById(R.id.tv_hour);
        tv_minute = (TextView)findViewById(R.id.tv_minute);
        rd_date = (RadioButton)findViewById(R.id.rd_date);
        rd_time = (RadioButton)findViewById(R.id.rd_time);
        cal = (CalendarView)findViewById(R.id.cal);
        time = (TimePicker)findViewById(R.id.time);
        bt_reserve = (Button)findViewById(R.id.bt_reserve);
        rd_date.setOnClickListener(this);
        rd_time.setOnClickListener(this);
        bt_reserve.setOnClickListener(this);
        time.setVisibility(View.INVISIBLE);//사용자 눈에 보이지 않음
        cal.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.rd_date:
                time.setVisibility(View.INVISIBLE);
                cal.setVisibility(View.VISIBLE);
                break;
            case R.id.rd_time:
                time.setVisibility(View.VISIBLE);
                cal.setVisibility(View.INVISIBLE);
                break;
            case R.id.bt_reserve:

                break;
        }
    }
}
