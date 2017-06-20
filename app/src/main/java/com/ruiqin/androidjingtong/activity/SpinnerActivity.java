package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;

public class SpinnerActivity extends BaseActivity {

    @BindView(R.id.spinner)
    Spinner mSpinner;
    private Context mContext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent( context, SpinnerActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        String[] ctype = new String[]{"身份证", "学生证", "军人证"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ctype);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

    }

    @Override
    protected int getChildView() {
        return R.layout.activity_spinner;
    }
}
