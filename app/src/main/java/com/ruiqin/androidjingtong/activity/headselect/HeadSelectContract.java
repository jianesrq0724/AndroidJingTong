package com.ruiqin.androidjingtong.activity.headselect;

import android.content.Context;
import android.os.Bundle;

import com.ruiqin.androidjingtong.adapter.HeadSelectGridViewAdapter;
import com.ruiqin.androidjingtong.base.BaseModel;
import com.ruiqin.androidjingtong.base.BasePresenter;
import com.ruiqin.androidjingtong.base.BaseView;

import java.util.List;

/**
 * Created by jiane on 2016/9/28.
 */

public interface HeadSelectContract {
    interface View extends BaseView {
        void setAdapterResult(HeadSelectGridViewAdapter headSelectGridViewAdapter);
        void setOnItemClickListenerResult(Bundle bundle);
    }

    interface Model extends BaseModel {
        int[] initData();
        Bundle getImageId(int position);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        abstract void setAdapter(Context context);
        abstract void setOnItemClickListener(int position);
    }
}
