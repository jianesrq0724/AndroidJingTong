package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.view.SlideFollowView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static butterknife.ButterKnife.bind;

/**
 * 自定义View，随手指移动的图片
 */
public class CustomViewActivity extends AppCompatActivity {

    private Unbinder unbinder;

//    @BindView(R.id.framelayout)
//    FrameLayout framelayout;

    SlideFollowView slideFollowView;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, CustomViewActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        unbinder = ButterKnife.bind(this);

        slideFollowView = (SlideFollowView) findViewById(R.id.slidefollowview);
        slideFollowView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                slideFollowView.bitmapX = event.getX();
                slideFollowView.bitmapY = event.getY();
                slideFollowView.invalidate();
                return true;
            }
        });
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}
