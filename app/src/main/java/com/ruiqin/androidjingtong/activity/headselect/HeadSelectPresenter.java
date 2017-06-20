package com.ruiqin.androidjingtong.activity.headselect;

import android.content.Context;

import com.ruiqin.androidjingtong.adapter.HeadSelectGridViewAdapter;

/**
 * Created by jiane on 2016/9/28.
 */

public class HeadSelectPresenter extends HeadSelectContract.Presenter{
    @Override
    void setAdapter(Context context) {
        int[] imageIds = mModel.initData();
        HeadSelectGridViewAdapter headSelectGridViewAdapter = new HeadSelectGridViewAdapter(context, imageIds);
        mView.setAdapterResult(headSelectGridViewAdapter);
    }

    @Override
    void setOnItemClickListener(int position) {
        mView.setOnItemClickListenerResult(mModel.getImageId(position));
    }
}
