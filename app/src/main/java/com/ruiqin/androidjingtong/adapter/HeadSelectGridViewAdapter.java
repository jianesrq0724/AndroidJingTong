package com.ruiqin.androidjingtong.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by jiane on 2016/9/28.
 */

public class HeadSelectGridViewAdapter extends BaseAdapter{

    private int[] mImageIds;
    private Context mContext;

    public HeadSelectGridViewAdapter(Context context, int[] imageIds) {
        this.mImageIds = imageIds;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if ( convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setAdjustViewBounds(true);
            imageView.setPadding(10, 10, 10, 10);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mImageIds[position]);

        return imageView;
    }
}
