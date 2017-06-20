package com.ruiqin.androidjingtong.activity.home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.activity.AutoCompleteTextViewActivity;
import com.ruiqin.androidjingtong.activity.ChronometerActivity;
import com.ruiqin.androidjingtong.activity.CustomViewActivity;
import com.ruiqin.androidjingtong.activity.DatePickerActivity;
import com.ruiqin.androidjingtong.activity.EggWhereActivity;
import com.ruiqin.androidjingtong.activity.GrideImageSwitchActivity;
import com.ruiqin.androidjingtong.activity.headpic.HeadPicActivity;
import com.ruiqin.androidjingtong.activity.ImageSwitchActivity;
import com.ruiqin.androidjingtong.activity.NotificationActivity;
import com.ruiqin.androidjingtong.activity.RadioButtonActivity;
import com.ruiqin.androidjingtong.activity.SpinnerActivity;
import com.ruiqin.androidjingtong.activity.TimePickerActivity;
import com.ruiqin.androidjingtong.adapter.MainRecyclerViewApapter;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainPresenter, MainModel> implements MainContract.View{

    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;
    private Context mContext;

    @Override
    protected int getChildView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        mPresenter.setAdapter(mContext);
    }

    @Override
    public void setAdapterResult(MainRecyclerViewApapter recyclerViewApapter) {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        setRecyclerViewItemClick(recyclerViewApapter);//点击事件，自己实现
        mRecyclerView.setAdapter(recyclerViewApapter);
    }

    /**
     * 点击事件
     *
     */
    private void setRecyclerViewItemClick(MainRecyclerViewApapter recyclerViewApapter) {
        recyclerViewApapter.setClickLister(new MainRecyclerViewApapter.OnItemClickLister() {
            @Override
            public void onClick(View view, int position) {
                mPresenter.setRecyclerViewItemClick(position);
            }
        });
    }

    @Override
    public void setRecyclerViewItemClickResult0() {
        CustomViewActivity.startActivity(mContext);
    }

    @Override
    public void setRecyclerViewItemClickResult1() {
        RadioButtonActivity.startActivity(mContext);
    }

    @Override
    public void setRecyclerViewItemClickResult2() {
        SpinnerActivity.startActivity(mContext);//spinner
    }

    @Override
    public void setRecyclerViewItemClickResult3() {
        DatePickerActivity.startActivity(mContext);//日期拾取器
    }

    @Override
    public void setRecyclerViewItemClickResult4() {
        TimePickerActivity.startActivity(mContext);//时间拾取器
    }

    @Override
    public void setRecyclerViewItemClickResult5() {
        ChronometerActivity.startActivity(mContext);//计时器
    }

    @Override
    public void setRecyclerViewItemClickResult6() {
        EggWhereActivity.startActivity(mContext);
    }

    @Override
    public void setRecyclerViewItemClickResult7() {
        AutoCompleteTextViewActivity.startActivity(mContext);
    }

    @Override
    public void setRecyclerViewItemClickResult8() {
        ImageSwitchActivity.startActivity(mContext);
    }

    @Override
    public void setRecyclerViewItemClickResult9() {
        NotificationActivity.startActivity(mContext);
    }

    @Override
    public void setRecyclerViewItemClickResult10() {
        GrideImageSwitchActivity.startActivity(mContext);
    }

    @Override
    public void setRecyclerViewItemClickResult11() {
        HeadPicActivity.startActivity(mContext);
    }
}
