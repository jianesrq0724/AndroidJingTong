package com.ruiqin.androidjingtong.activity.headselect;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.adapter.HeadSelectGridViewAdapter;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;

public class HeadSelectActivity extends BaseActivity<HeadSelectPresenter, HeadSelectModel> implements HeadSelectContract.View {

    @BindView(R.id.gridview)
    GridView mGridview;
    private Context mContext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, HeadSelectActivity.class));
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_head_select;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        mPresenter.setAdapter(mContext);

        /**
         * gridview的点击事件
         */
        mGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mPresenter.setOnItemClickListener(position);
            }
        });
    }

    @Override
    public void setAdapterResult(HeadSelectGridViewAdapter headSelectGridViewAdapter) {
        mGridview.setAdapter(headSelectGridViewAdapter);
    }

    @Override
    public void setOnItemClickListenerResult(Bundle bundle) {
        Intent intent = getIntent();
        intent.putExtras(bundle);
        setResult(0x11, intent);
        finish();
    }
}
