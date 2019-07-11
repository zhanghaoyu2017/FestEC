package com.example.latte.ec.icon;
import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

/**
 * Created by Android Studio.
 * User: zhanghaoyu
 * Date: 2019/7/9
 * Time: 23:22
 */
public class FontEcModule implements IconFontDescriptor{
    @Override
    public String ttfFileName() {
        return "iconfont.ttf";
    }

    @Override
    public Icon[] characters() {
        return EcIcons.values();
    }
}
