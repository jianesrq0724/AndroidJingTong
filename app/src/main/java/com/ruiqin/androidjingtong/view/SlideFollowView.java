package com.ruiqin.androidjingtong.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.ruiqin.androidjingtong.R;

/**
 * Created by jiane on 2016/9/23.
 */

public class SlideFollowView extends View{
    public float bitmapX = 200;
    public float bitmapY = 300;

    public SlideFollowView(Context context) {
        super(context);
        bitmapX = 200;
        bitmapY = 300;
    }

    public SlideFollowView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SlideFollowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher);
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
        if ( bitmap != null) {
            bitmap.recycle();
        }
    }
}
