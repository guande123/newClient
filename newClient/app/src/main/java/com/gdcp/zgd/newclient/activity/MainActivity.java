package com.gdcp.zgd.newclient.activity;


import android.graphics.Color;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gdcp.zgd.newclient.R;

public class MainActivity extends BaseActivity {

     private Toolbar mToolbar;
    @Override
    protected void initData() {
       initToolbar();
    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(mToolbar);

        mToolbar.setLogo(R.drawable.biz_video_pause);
        mToolbar.setTitle("ToolBar");   // 通过代码设置才生效：app:title="toolbar"

        mToolbar.setSubtitle("这是子标题");
        mToolbar.setTitleTextColor(Color.RED);
        mToolbar.setSubtitleTextColor(Color.YELLOW);

        // 导航栏图标显示
        mToolbar.setNavigationIcon(R.drawable.biz_news_tie_share);

        // 点击toolbar导航栏左上角的图标后，退出当前界面
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {

    }
//================Toolbar右上角弹出菜单(begin)=======================

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_option, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.item_01) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //================Toolbar右上角弹出菜单(end)=========================
    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }
}
