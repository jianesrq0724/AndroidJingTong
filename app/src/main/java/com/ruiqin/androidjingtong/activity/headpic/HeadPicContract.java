package com.ruiqin.androidjingtong.activity.headpic;

import android.content.Intent;

import com.ruiqin.androidjingtong.base.BaseModel;
import com.ruiqin.androidjingtong.base.BasePresenter;
import com.ruiqin.androidjingtong.base.BaseView;

/**
 * Created by jiane on 2016/9/28.
 */

public interface HeadPicContract {
    interface View extends BaseView {
        void clickSelectHeadResult();
        void onActivityResult2(int imageId);
    }

    interface Model extends BaseModel {

    }

    abstract class Presenter extends BasePresenter<View, Model> {
        abstract void clickSelectHead();
        abstract void onActivityResult(int requestCode, int resultCode, Intent data);
    }
}
