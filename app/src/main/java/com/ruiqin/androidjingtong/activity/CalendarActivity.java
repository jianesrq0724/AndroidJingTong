package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;

public class CalendarActivity extends BaseActivity {

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, CalendarActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_calendar;
    }
}
