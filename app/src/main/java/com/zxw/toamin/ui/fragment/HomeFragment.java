package com.zxw.toamin.ui.fragment;

import com.zxw.toamin.base.BaseFragment;
import com.zxw.toamin.base.BasePresenter;

public class HomeFragment extends BaseFragment{

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {
        return 0;
    }
}
