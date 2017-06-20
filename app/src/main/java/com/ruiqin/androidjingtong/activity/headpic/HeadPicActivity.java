package com.ruiqin.androidjingtong.activity.headpic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.activity.headselect.HeadSelectActivity;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class HeadPicActivity extends BaseActivity<HeadPicPresenter, HeadPicModel> implements HeadPicContract.View{

    @BindView(R.id.iv_headpic)
    ImageView mIvHeadpic;
    private Context mContext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, HeadPicActivity.class));
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_head;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
    }

    /**
     * 选择头像
     */
    @OnClick(R.id.btn_select_head)
    public void clickSelectHead() {
        mPresenter.clickSelectHead();
    }

    @Override
    public void clickSelectHeadResult() {
//        HeadSelectActivity.startActivity(mContext);
        startActivityForResult(new Intent(mContext, HeadSelectActivity.class), 0x11);
    }

    @Override
    public void onActivityResult2(int imageId) {
        mIvHeadpic.setImageResource(imageId);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mPresenter.onActivityResult(requestCode, resultCode, data);
    }
}
