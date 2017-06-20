package com.ruiqin.androidjingtong.activity.headpic;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by jiane on 2016/9/28.
 */

public class HeadPicPresenter extends HeadPicContract.Presenter{
    @Override
    void clickSelectHead() {
        mView.clickSelectHeadResult();
    }

    @Override
    void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ( requestCode == 0x11 && resultCode == 0x11) {
            Bundle bundle = data.getExtras();
            int imageId = bundle.getInt("imageId");
            mView.onActivityResult2(imageId);
        }
    }
}
