package com.ruiqin.androidjingtong.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by jiane on 2016/9/27.
 */

public class GrideBaseAdapter extends BaseAdapter{

    private int[] mImageId;
    private Context mContext;

    public GrideBaseAdapter(Context context, int[] imageId) {
        this.mContext = context;
        this.mImageId = imageId;
    }

    @Override
    public int getCount() {
        return mImageId.length;
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
//            imageView.setMaxWidth(150);
//            imageView.setMaxHeight(113);
            imageView.setPadding(5, 5, 5, 5);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mImageId[position]);
        return imageView;
    }
}
