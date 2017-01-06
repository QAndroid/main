package com.qandroid.main.render.presenter;

import android.content.Context;

import com.qandroid.common.QBasePresenter;
import com.qandroid.common.QBaseView;
import com.qandroid.main.render.model.RenderResult;

/**
 * Render页面View和Present层沟通接口定义
 * Created by chengxiang.peng on 2016/12/9.
 */

public interface RenderContact {
    interface ViewQ extends QBaseView<PresenterQ> {
        /**
         * 初始化Render列表的显示
         */
        void initRenderListShow(RenderResult renderResult);
    }

    interface PresenterQ extends QBasePresenter {
        /**
         * 显示Render列表
         */
        void showRenderList(Context context);
    }
}
