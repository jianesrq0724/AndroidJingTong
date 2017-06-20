package com.ruiqin.androidjingtong.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.adapter.GrideBaseAdapter;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.BindView;

public class GrideImageSwitchActivity extends BaseActivity {

    @BindView(R.id.gridview)
    GridView mGridview;
    @BindView(R.id.imageswitcher)
    ImageSwitcher mImageswitcher;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, GrideImageSwitchActivity.class));
    }

    /**
     * Called when the activity is first created.
     */
    private int[] imageId = new int[]{R.mipmap.img01, R.mipmap.img02,
            R.mipmap.img03, R.mipmap.img04, R.mipmap.img05,
            R.mipmap.img06, R.mipmap.img07, R.mipmap.img08,
            R.mipmap.img09, R.mipmap.img10, R.mipmap.img11,
            R.mipmap.img12,}; // 定义并初始化保存图片id的数组

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GrideBaseAdapter grideBaseAdapter = new GrideBaseAdapter(this, imageId);
        mGridview.setAdapter(grideBaseAdapter);

        mImageswitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        mImageswitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        mImageswitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(GrideImageSwitchActivity.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });


        mGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mImageswitcher.setImageResource(imageId[position]);
            }
        });

    }

    @Override
    protected int getChildView() {
        return R.layout.activity_gride_image_switch;
    }
}
