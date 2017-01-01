package com.qandroid.main;

import android.view.View;

import com.qandroid.common.QBaseActivity;
import com.qandroid.function.FunctionActivity;
import com.qandroid.main.classloader.ClassLoaderActivity;
import com.qandroid.main.render.view.RenderActivity;
import com.qandroid.main.smartupdate.SmartUpdateActivity;
import com.qandroid.summary.SummaryActivity;
import com.qandroid.test.TestActivity;
import com.qandroid.ui.UiActivity;

import org.xutils.view.annotation.ContentView;

@ContentView(R.layout.activity_main)
public class MainActivity extends QBaseActivity {

    public void toFeature(View view) {
        toActivityByClass(FunctionActivity.class);
    }

    public void toKnowledge(View view) {
        toActivityByClass(SummaryActivity.class);
    }

    public void toUi(View view) {
        toActivityByClass(UiActivity.class);
    }

    public void toTest(View view) {
        toActivityByClass(TestActivity.class);
    }

    public void toSmartUpdate(View view) {
        toActivityByClass(SmartUpdateActivity.class);
    }

    public void toClassLoader(View view) {
        toActivityByClass(ClassLoaderActivity.class);
    }

    public void toRender(View view) {
        toActivityByClass(RenderActivity.class);
    }
}
