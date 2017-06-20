package com.ruiqin.androidjingtong.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jiane on 2016/9/22.
 */

public class ToastUtils {
    private static Toast makeText = null;
    public static void show(Context context, String message) {
        if (makeText == null) {
            makeText = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        } else {
            makeText.setText(message);
        }
        makeText.show();
    }
}
