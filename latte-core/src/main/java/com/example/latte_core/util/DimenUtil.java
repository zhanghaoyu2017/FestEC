package com.example.latte_core.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.example.latte_core.app.Latte;

/**
 * Created by Android Studio.
 * User: zhanghaoyu
 * Date: 2019/7/23
 * Time: 11:31
 */
public class DimenUtil {
    //得到屏幕的宽
    public static int getScreenWidth(){
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm  = resources.getDisplayMetrics();
        return dm.widthPixels;
    }
    public static int getScreenHeight() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }

}
