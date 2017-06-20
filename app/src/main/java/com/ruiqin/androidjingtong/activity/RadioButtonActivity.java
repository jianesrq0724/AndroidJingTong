package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;
import com.ruiqin.androidjingtong.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class RadioButtonActivity extends BaseActivity {

//    @BindView(R.id.rdg_sex)
    RadioGroup mRdgSex;
//    @BindView(R.id.btn_submit)
    Button btnSubmit;
    private Context mContext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, RadioButtonActivity.class));
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_radio_button;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        mRdgSex = (RadioGroup) findViewById(R.id.rdg_sex);

        /**
         * radiogroup点击改变事件
         */
        setRadioGroupCheckChangeListener();

        mRdgSex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < mRdgSex.getChildCount(); i++) {
                    RadioButton r = (RadioButton) mRdgSex.getChildAt(i);
                    if ( r.isChecked()) {
                        ToastUtils.show(mContext, r.getText().toString());
                    }
                }
            }
        });
    }

    /**
     * radiogroup点击改变事件
     */
    private void setRadioGroupCheckChangeListener() {
        mRdgSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton r = (RadioButton) findViewById(checkedId);

                switch (checkedId) {
                    case R.id.rdb_lad:
                        ToastUtils.show(mContext, "boy");
                        break;
                    case R.id.rdb_girl:
                        ToastUtils.show(mContext, "girl");
                        break;
                }
            }
        });
    }

    /**
     * 点击提交
     */
    @OnClick(R.id.btn_submit)
    public void btnSubmitClick() {
        for (int i = 0; i < mRdgSex.getChildCount(); i++) {

            if ( mRdgSex.getChildAt(i) instanceof RadioButton) {
                RadioButton r = (RadioButton) mRdgSex.getChildAt(i);
                if ( r.isChecked()) {
                    ToastUtils.show(mContext, r.getText().toString());
                }
            }
        }
//        ToastUtils.show(mContext, "提交");
    }
}
