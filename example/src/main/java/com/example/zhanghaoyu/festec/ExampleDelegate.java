package com.example.zhanghaoyu.festec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.latte_core.delegates.LatteDelegate;

/**
 * Created by Android Studio.
 * User: zhanghaoyu
 * Date: 2019/7/12
 * Time: 16:51
 */
public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
