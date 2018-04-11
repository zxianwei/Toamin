package com.zxw.toamin.ui.fragment;


import com.zxw.toamin.R;
import com.zxw.toamin.base.BaseFragment;
import com.zxw.toamin.base.BasePresenter;
import com.zxw.toamin.ui.view.Homeview;

/**
 *
 */
public class HomeFragment extends BaseFragment<Homeview>{

    public static TypeFragment newInstance() {
        return new TypeFragment();
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.frag_home;
    }
}
