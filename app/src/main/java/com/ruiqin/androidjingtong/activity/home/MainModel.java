package com.ruiqin.androidjingtong.activity.home;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiane on 2016/9/28.
 */

public class MainModel implements MainContract.Model{

    @Override
    public List<String> initData() {
        List<String> mListData = new ArrayList<String>();
        mListData.add("自定义View，跟随手指移动的图片");
        mListData.add("点击选择性别, RadioButton");
        mListData.add("Spinner的使用");
        mListData.add("日期拾取器 dataPicker");
        mListData.add("时间拾取器 timePicker");
        mListData.add("计时器 Chronometer");
        mListData.add("猜测鸡蛋在哪里");
        mListData.add("mAutocompletetextview");
        mListData.add("ImageSwitch");
        mListData.add("Notification");
        mListData.add("Gride+ImageSwitch");
        mListData.add("头像选择");
        return mListData;
    }
}
