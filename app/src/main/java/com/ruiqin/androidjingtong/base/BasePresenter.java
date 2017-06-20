package com.ruiqin.androidjingtong.base;

/**
 * Created by jiane on 2016/9/28.
 */

public class BasePresenter<T, M> {

    public T mView;
    public M mModel;

    public void setVM(T v, M m) {
        this.mView = v;
        this.mModel = m;
    }
}
