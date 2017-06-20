package com.ruiqin.androidjingtong.activity.headselect;

import android.os.Bundle;

import com.ruiqin.androidjingtong.R;

/**
 * Created by jiane on 2016/9/28.
 */

public class HeadSelectModel implements HeadSelectContract.Model{

    private int[] imageId = new int[]{R.mipmap.img01, R.mipmap.img02,
            R.mipmap.img03, R.mipmap.img04, R.mipmap.img05,
            R.mipmap.img06, R.mipmap.img07, R.mipmap.img08,
            R.mipmap.img09, R.mipmap.img10, R.mipmap.img11,
            R.mipmap.img12,}; // 定义并初始化保存图片id的数组

    @Override
    public int[] initData() {
        return imageId;
    }

    @Override
    public Bundle getImageId(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("imageId", imageId[position]);
        return bundle;
    }

}
