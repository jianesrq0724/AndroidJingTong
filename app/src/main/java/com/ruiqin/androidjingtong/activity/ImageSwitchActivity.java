package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ImageSwitchActivity extends BaseActivity {

    private int[] imageId = new int[]{R.mipmap.shoe_ok, R.mipmap.shoe_sorry, R.mipmap.shoe_default, R.mipmap.ic_launcher};

    @BindView(R.id.imageSwitcher1)
    ImageSwitcher mImageSwitcher1;

    int index = 0;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, ImageSwitchActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mImageSwitcher1.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        mImageSwitcher1.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        mImageSwitcher1.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(ImageSwitchActivity.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        mImageSwitcher1.setImageResource(imageId[index]);
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_image_switch;
    }

    /**
     * 上一个
     */
    @OnClick(R.id.btn_last)
    public void clickLast() {
        if ( index > 0) {
            index--;
        } else {
            index = imageId.length - 1;
        }
        mImageSwitcher1.setImageResource(imageId[index]);
    }

    /**
     * 下一个
     */
    @OnClick(R.id.btn_next)
    public void clickNext() {
        if ( index < imageId.length -1) {
            index++;
        } else {
            index = 0;
        }
        mImageSwitcher1.setImageResource(imageId[index]);
    }

}
