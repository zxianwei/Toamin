package com.zxw.toamin.ui.presenter;

import com.zxw.toamin.base.BasePresenter;
import com.zxw.toamin.ui.view.Homeview;

public class Homepresenter extends BasePresenter<Homeview> {
    private int mCurrentpage;

    /**
     * 刷新
     */
    public void getRefreshData() {
        mCurrentpage = 0;

    }
}
