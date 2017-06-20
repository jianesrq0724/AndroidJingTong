package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;
import com.ruiqin.androidjingtong.utils.ToastUtils;

import java.util.Calendar;

import butterknife.BindView;

/**
 * 时间拾取器
 */
public class DatePickerActivity extends BaseActivity {

    @BindView(R.id.datepicker)
    android.widget.DatePicker mDatepicker;
    private int year, month, day, hour, minute;

    private Context mContext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, DatePickerActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = this;

        getCurrentDate();

        initDatepicker();//初始化日期

        mDatepicker.init(year, month, day, new android.widget.DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                DatePickerActivity.this.year = year;
                DatePickerActivity.this.month = monthOfYear;
                DatePickerActivity.this.day = dayOfMonth;
                ToastUtils.show(mContext, year + "年" + (month + 1) + "月" + day + "日");
            }
        });
    }

    /**
     * 初始化日期
     */
    private void initDatepicker() {
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_date_picker;
    }


    /**
     * 得到当前日期
     */
    public void getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
    }
}
