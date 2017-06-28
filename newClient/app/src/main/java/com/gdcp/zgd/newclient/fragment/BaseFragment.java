package com.gdcp.zgd.newclient.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yls on 2017/6/28.
 */

public abstract  class BaseFragment extends Fragment {
    private View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView==null){
            rootView = LayoutInflater.from(getContext()).inflate(getResLayout(),container,false);
            initView();
            initListener();
            initData();
        }
         return  rootView;
    }

    protected abstract void initData();

    protected abstract void initListener();

    protected abstract void initView();

    protected abstract int getResLayout();
}
