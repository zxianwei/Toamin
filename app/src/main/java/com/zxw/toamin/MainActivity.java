package com.zxw.toamin;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.zxw.toamin.base.BaseActivity;
import com.zxw.toamin.base.BasePresenter;
import com.zxw.toamin.util.UIUtils;
import com.zxw.toamin.widget.IconFontTextView;

import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.ll_home)
    LinearLayout ll_home;
    @BindView(R.id.ll_type)
    LinearLayout ll_type;
    @BindView(R.id.ll_user)
    LinearLayout ll_user;
    @BindView(R.id.if_home)
    IconFontTextView if_home;
    @BindView(R.id.if_type)
    IconFontTextView if_type;
    @BindView(R.id.if_user)
    IconFontTextView if_user;
    @BindView(R.id.tv_type)
    TextView tv_type;
    @BindView(R.id.tv_home)
    TextView tv_home;
    @BindView(R.id.tv_user)
    TextView tv_user;


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
        setTabColor(if_home, tv_home);

    }

    @OnClick({R.id.ll_home, R.id.ll_type, R.id.ll_user})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_home:
                setTabColor(if_home, tv_home);
                Toast.makeText(this, "11", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_type:
                setTabColor(if_type, tv_type);
                Toast.makeText(this, "11", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_user:
                setTabColor(if_user, tv_user);
                Toast.makeText(this, "11", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }



    /**
     * 设置icon和字体颜色
     *
     * @param icon
     * @param textView
     */
    private void setTabColor(IconFontTextView icon, TextView textView) {
//        if_home.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
//        tv_home.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
//        if_type.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
//        tv_type.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
//        if_user.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
//        tv_user.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
//
//        icon.setTextColor(UIUtils.getColor(R.color.tab_sel_color));
//        textView.setTextColor(UIUtils.getColor(R.color.tab_sel_color));

    }
}
