package com.ruiqin.androidjingtong.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ruiqin.androidjingtong.utils.TUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by jiane on 2016/9/23.
 */

public abstract class BaseActivity<T extends BasePresenter, M extends BaseModel> extends AppCompatActivity{
    private Unbinder unbinder;
    public T mPresenter;
    private M mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getChildView());
        unbinder = ButterKnife.bind(this);

        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);

        if ( this instanceof BaseView) {
            mPresenter.setVM(this, mModel);
        }
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }

    protected abstract int getChildView();
}
