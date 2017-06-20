package com.ruiqin.androidjingtong.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ruiqin.androidjingtong.R;

import java.util.List;

import static android.media.CamcorderProfile.get;

/**
 * Created by jiane on 2016/9/23.
 */

public class MainListViewAdapter extends BaseAdapter{

    private List<String> mListData;
    private Context mContext;


    public MainListViewAdapter(Context context, List<String> listData) {
        this.mListData = listData;
        this.mContext = context;
    }


    @Override
    public int getCount() {
        return mListData.size();
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
        //        View view = null;
//        MainActivity.ViewHolder holder;
//        if ( convertView == null) {
//            view = View.inflate(mContext, R.layout.item_main, null);
//            holder = new MainActivity.ViewHolder(view);
//            view.setTag(holder);
//        } else {
//            view = convertView;
//            holder = (MainActivity.ViewHolder) view.getTag();
//        }
//        holder.textView.setText(getListData().get(position));
//        return view;


        ViewHolder holder;
        if ( convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_main, null);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }



        holder.textView.setText(mListData.get(position));//赋值
        return convertView;
    }


    public static class ViewHolder {
        TextView textView;
    }
}
