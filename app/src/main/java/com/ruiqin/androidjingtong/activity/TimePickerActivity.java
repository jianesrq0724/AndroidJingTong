package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;
import com.ruiqin.androidjingtong.utils.ToastUtils;

import java.util.Calendar;

import butterknife.BindView;

public class TimePickerActivity extends BaseActivity {

    @BindView(R.id.timepicker)
    android.widget.TimePicker mTimepicker;

    private int mHourse, mMinuter;

    private Context mContext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, TimePickerActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTimepicker.setIs24HourView(true);
        mContext = this;

        getCurrentTime();


        mTimepicker.setOnTimeChangedListener(new android.widget.TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(android.widget.TimePicker view, int hourOfDay, int minute) {
                TimePickerActivity.this.mMinuter = minute;
                TimePickerActivity.this.mHourse = hourOfDay;

                ToastUtils.show(mContext, mHourse + "点" + mMinuter + "分");
            }
        });
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_time_picker;
    }

    /**
     * 得到当前的时间
     * @return
     */
    public void getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        mHourse = calendar.get(Calendar.HOUR_OF_DAY);
        mMinuter = calendar.get(Calendar.MINUTE);
    }
}
