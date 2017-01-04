package com.qandroid.main;

import android.app.Application;

import com.qandroid.common.QBaseActivity;
import com.qandroid.common.QBaseApplication;
import com.squareup.leakcanary.LeakCanary;

import org.xutils.x;

/**
 * Created by chengxiang.peng on 2016/12/9.
 */
public class MainAplication extends QBaseApplication{
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化XUtils框架
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 开启debug会影响性能
    }
}