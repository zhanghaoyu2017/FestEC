package com.example.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by Android Studio.
 * User: zhanghaoyu
 * Date: 2019/7/9
 * Time: 23:43
 */
public enum  EcIcons implements Icon {
    icon_scan('\ue505'),
    icon_ali_pay('\ue603');
    public char character;
    EcIcons(char character){
        this.character =character;
    }
    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
