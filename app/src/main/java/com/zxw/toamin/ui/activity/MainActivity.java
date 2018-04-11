package com.zxw.toamin.ui.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zxw.toamin.R;
import com.zxw.toamin.base.BaseActivity;
import com.zxw.toamin.base.BasePresenter;
import com.zxw.toamin.ui.adapter.FragPagerAdapter;
import com.zxw.toamin.ui.fragment.HomeFragment;
import com.zxw.toamin.ui.fragment.TypeFragment;
import com.zxw.toamin.ui.fragment.UserFragment;
import com.zxw.toamin.util.UIUtils;
import com.zxw.toamin.widget.IconFontTextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {

    ViewPager viewPager;
    IconFontTextView ifHome;
    TextView tvHome;
    LinearLayout llHome;
    IconFontTextView ifType;
    TextView tvType;
    LinearLayout llType;
    IconFontTextView ifUser;
    TextView tvUser;
    LinearLayout llUser;

    List<Fragment> mFragments = new ArrayList<>();


    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {

        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        viewPager = (ViewPager) $(R.id.viewpager);
        tvHome = (TextView) $(R.id.tv_home);
        tvType = (TextView) $(R.id.tv_type);
        tvUser = (TextView) $(R.id.tv_user);
        llHome = (LinearLayout) $(R.id.ll_home);
        llType = (LinearLayout) $(R.id.ll_type);
        llUser = (LinearLayout) $(R.id.ll_user);
        ifHome = (IconFontTextView) $(R.id.if_home);
        ifType = (IconFontTextView) $(R.id.if_type);
        ifUser = (IconFontTextView) $(R.id.if_user);
        setTabColor(ifHome, tvHome);
        initViewpager();
    }

    private void setTabColor(IconFontTextView icon, TextView textView) {
        ifHome.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        tvHome.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        ifType.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        tvType.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        ifUser.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        tvUser.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        icon.setTextColor(UIUtils.getColor(R.color.tab_sel_color));
        textView.setTextColor(UIUtils.getColor(R.color.tab_sel_color));
    }

    private void initViewpager() {
        mFragments.add(HomeFragment.newInstance());
        mFragments.add(TypeFragment.newInstance());
        mFragments.add(UserFragment.newInstance());
        viewPager.setAdapter(new FragPagerAdapter(getSupportFragmentManager(), mFragments));
        viewPager.setCurrentItem(0, false);
        viewPager.setOffscreenPageLimit(3);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        setTabColor(ifHome, tvHome);
                        break;
                    case 1:
                        setTabColor(ifType, tvType);
                        break;
                    case 2:
                        setTabColor(ifUser, tvUser);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_home:
                viewPager.setCurrentItem(0);
                setTabColor(ifHome, tvHome);
                break;
            case R.id.ll_type:
                viewPager.setCurrentItem(1);
                setTabColor(ifType, tvType);
                break;
            case R.id.ll_user:
                viewPager.setCurrentItem(2);
                setTabColor(ifUser, tvUser);
                break;
        }
    }


}
