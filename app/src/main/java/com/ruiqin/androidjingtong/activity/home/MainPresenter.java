package com.ruiqin.androidjingtong.activity.home;
import android.content.Context;
import com.ruiqin.androidjingtong.adapter.MainRecyclerViewApapter;
import java.util.List;

/**
 * Created by jiane on 2016/9/28.
 */

public class MainPresenter extends MainContract.Presenter{

    @Override
    List<String> initData() {
        return mModel.initData();
    }

    @Override
    void setRecyclerViewItemClick(int position) {
        switch (position) {
            case 0:
                mView.setRecyclerViewItemClickResult0();
                break;
            case 1:
                mView.setRecyclerViewItemClickResult1();
                break;
            case 2:
                mView.setRecyclerViewItemClickResult2();
                break;
            case 3:
                mView.setRecyclerViewItemClickResult3();
                break;
            case 4:
                mView.setRecyclerViewItemClickResult4();
                break;
            case 5:
                mView.setRecyclerViewItemClickResult5();
                break;
            case 6:
                mView.setRecyclerViewItemClickResult6();
                break;
            case 7:
                mView.setRecyclerViewItemClickResult7();
                break;
            case 8:
                mView.setRecyclerViewItemClickResult8();
                break;
            case 9:
                mView.setRecyclerViewItemClickResult9();
                break;
            case 10:
                mView.setRecyclerViewItemClickResult10();
                break;
            case 11:
                mView.setRecyclerViewItemClickResult11();
                break;
            default:
                break;
        }
    }

    @Override
    void setAdapter(Context context) {
        List<String> mListData;
        mListData = mModel.initData();
        MainRecyclerViewApapter recyclerViewApapter = new MainRecyclerViewApapter(context, mListData);
        mView.setAdapterResult(recyclerViewApapter);
    }
}
