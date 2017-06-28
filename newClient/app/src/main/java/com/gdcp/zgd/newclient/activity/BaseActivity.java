package com.gdcp.zgd.newclient.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yls on 2017/6/28.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
         initView();
         initListener();
         initData();
    }

    protected abstract void initData();

    protected abstract void initListener();

    protected abstract void initView();

    protected abstract int getLayoutRes();
}
