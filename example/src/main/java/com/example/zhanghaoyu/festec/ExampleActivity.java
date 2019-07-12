package com.example.zhanghaoyu.festec;


import com.example.latte_core.activities.ProxyActivity;
import com.example.latte_core.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
