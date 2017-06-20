package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;

public class AutoCompleteTextViewActivity extends BaseActivity {

    private static final String[] data = new String[]{"a", "aa", "aabc", "b", "bc"};

    @BindView(R.id.autocompletetextview)
    AutoCompleteTextView mAutocompletetextview;


    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, AutoCompleteTextViewActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, data);
        mAutocompletetextview.setAdapter(adapter);
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_auto_complete_text_view;
    }
}
