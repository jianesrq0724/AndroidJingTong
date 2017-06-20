package com.ruiqin.androidjingtong.activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ruiqin.androidjingtong.R;
import com.ruiqin.androidjingtong.base.BaseActivity;

import butterknife.OnClick;

public class NotificationActivity extends BaseActivity {

    NotificationManager notificationManager;
    private Context mContext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, NotificationActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    @Override
    protected int getChildView() {
        return R.layout.activity_notification;
    }

    /**
     * 显示通知
     */
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick(R.id.btn_show_notification)
    public void clickShowNotification() {
        Notification.Builder builder = new Notification.Builder(mContext);
        builder.setContentTitle("Bmob Test");
        builder.setContentText("哈哈");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        Notification notification = builder.build();
        notificationManager.notify(R.mipmap.ic_launcher, notification);
    }
}
