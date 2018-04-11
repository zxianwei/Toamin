package com.zxw.toamin.ui.fragment;

import com.zxw.toamin.base.BaseFragment;
import com.zxw.toamin.base.BasePresenter;

public class UserFragment extends BaseFragment {
    public static UserFragment newInstance() {

        return new UserFragment();
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
