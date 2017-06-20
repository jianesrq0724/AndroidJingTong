package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChronometerActivity extends BaseActivity {

    @BindView(R.id.chronometer)
    Chronometer mChronometer;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, ChronometerActivity.class));
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_chronometer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mChronometer.setBase(SystemClock.elapsedRealtime());
        mChronometer.setFormat("已用时间: %s");
        mChronometer.start();

        mChronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if ( (SystemClock.elapsedRealtime() - chronometer.getBase() ) > 10000 ) {
                    mChronometer.stop();
                }
            }
        });
    }
}
