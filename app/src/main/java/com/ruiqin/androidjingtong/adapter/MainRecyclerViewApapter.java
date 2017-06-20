package com.ruiqin.androidjingtong.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ruiqin.androidjingtong.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jiane on 2016/9/26.
 */

public class MainRecyclerViewApapter extends RecyclerView.Adapter<MainRecyclerViewApapter.MyViewHolder> {
    private List<String> mListData;
    private Context mContext;
    private OnItemClickLister mClickLister;


    public void setClickLister(OnItemClickLister clickLister) {
        this.mClickLister = clickLister;
    }

    public MainRecyclerViewApapter(Context context, List<String> data) {
        this.mContext = context;
        this.mListData = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(View.inflate(mContext, R.layout.item_main, null));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mListData.get(position));
    }

    @Override
    public int getItemCount() {
        return mListData == null ? 0: mListData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.textView)
        TextView mTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mTextView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mClickLister.onClick(itemView, getAdapterPosition());
        }
    }

    public interface OnItemClickLister{
        void onClick(View view, int position);
    }
}
