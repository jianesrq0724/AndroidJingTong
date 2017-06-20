package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;
import com.ruiqin.androidjingtong.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class EggWhereActivity extends BaseActivity {

    @BindView(R.id.iv_shoe0)
    ImageView mIvShoe0;
    @BindView(R.id.iv_shoe1)
    ImageView mIvShoe1;
    @BindView(R.id.iv_shoe2)
    ImageView mIvShoe2;
    @BindView(R.id.tv_message)
    TextView mTvMessage;

    private Context mContext;

    private int[] drawbleId = new int[]{R.mipmap.shoe_ok, R.mipmap.shoe_sorry, R.mipmap.shoe_sorry};


    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, EggWhereActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        reset();
    }


    /**
     * 点击第一个鞋子
     */
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick(R.id.iv_shoe0)
    public void clickShow0() {
        isRight(mIvShoe0, 0);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick(R.id.iv_shoe1)
    public void clickShow1() {
        isRight(mIvShoe1, 1);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick(R.id.iv_shoe2)
    public void clickShow2() {
        isRight(mIvShoe2, 2);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void isRight(ImageView v, int index) {
        mIvShoe0.setImageResource(drawbleId[0]);
        mIvShoe1.setImageResource(drawbleId[1]);
        mIvShoe2.setImageResource(drawbleId[2]);

        mIvShoe0.setClickable(false);
        mIvShoe1.setClickable(false);
        mIvShoe2.setClickable(false);

        //更改透明
        mIvShoe0.setImageAlpha(100);
        mIvShoe1.setImageAlpha(100);
        mIvShoe2.setImageAlpha(100);

        v.setImageAlpha(255);

        if (drawbleId[index] == R.mipmap.shoe_ok) {
            ToastUtils.show(mContext, "恭喜猜对了");
            mTvMessage.setText("回答正确");
        } else {
            ToastUtils.show(mContext, "回答错误");
            mTvMessage.setText("回答错误");
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick(R.id.btn_again)
    public void clickBtnAgain() {
        reset();

        mIvShoe0.setImageAlpha(255);
        mIvShoe1.setImageAlpha(255);
        mIvShoe2.setImageAlpha(255);

        mIvShoe0.setClickable(true);
        mIvShoe1.setClickable(true);
        mIvShoe2.setClickable(true);

        mTvMessage.setText("猜猜鸡蛋在哪里里面");

        mIvShoe0.setImageResource(R.mipmap.shoe_default);
        mIvShoe1.setImageResource(R.mipmap.shoe_default);
        mIvShoe2.setImageResource(R.mipmap.shoe_default);
    }

    /**
     * 初始化，重置图片
     */
    private void reset() {
        for (int i = 0; i < drawbleId.length; i++) {
            int temp = drawbleId[i];
            int index = (int) (Math.random() * 3);
            drawbleId[i] = drawbleId[index];
            drawbleId[index] = temp;
        }
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_egg_where;
    }
}
