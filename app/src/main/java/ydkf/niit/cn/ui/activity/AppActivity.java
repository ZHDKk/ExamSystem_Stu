package ydkf.niit.cn.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import ydkf.niit.cn.ui.fragment.BaseFragment;
import ydkf.niit.cn.utils.StatusBarUtil;

/**
 * Created by zhdk on 2016/12/2.
 */

public abstract class AppActivity extends BaseActivity {
    protected abstract BaseFragment getFirstFragment();

    //获取Intent
    protected void handleIntent(Intent intent) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        if (null != getIntent()) {
            handleIntent(getIntent());
        }
        //避免重复添加Fragment
        if (null == getSupportFragmentManager().getFragments()) {
            BaseFragment firstFragment = getFirstFragment();
            StatusBarUtil.setColor(this,  getResources().getColor(R.color.colorPrimary));
            if (null != firstFragment) {
                addFragment(firstFragment);
            }
        }

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.layFrame;
    }
}
