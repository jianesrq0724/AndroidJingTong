package com.ruiqin.androidjingtong.activity.home;

import android.content.Context;
import com.ruiqin.androidjingtong.adapter.MainRecyclerViewApapter;
import com.ruiqin.androidjingtong.base.BaseModel;
import com.ruiqin.androidjingtong.base.BasePresenter;
import com.ruiqin.androidjingtong.base.BaseView;
import java.util.List;

/**
 * Created by jiane on 2016/9/28.
 */

public interface MainContract {

    interface Model extends BaseModel {
        List<String> initData();
    }

    interface View extends BaseView {
        void setAdapterResult(MainRecyclerViewApapter recyclerViewApapter);

        void setRecyclerViewItemClickResult0();

        void setRecyclerViewItemClickResult1();

        void setRecyclerViewItemClickResult2();

        void setRecyclerViewItemClickResult3();

        void setRecyclerViewItemClickResult4();

        void setRecyclerViewItemClickResult5();

        void setRecyclerViewItemClickResult6();

        void setRecyclerViewItemClickResult7();

        void setRecyclerViewItemClickResult8();

        void setRecyclerViewItemClickResult9();

        void setRecyclerViewItemClickResult10();

        void setRecyclerViewItemClickResult11();//头像选择
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        abstract List<String> initData();

        abstract void setRecyclerViewItemClick(int position);

        abstract void setAdapter(Context context);
    }
}
