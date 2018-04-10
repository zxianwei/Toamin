package com.zxw.toamin.base;

import android.app.Dialog;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.zhy.autolayout.AutoLayoutActivity;
import com.zxw.toamin.R;
import com.zxw.toamin.app.App;
import com.zxw.toamin.widget.CustomDialog;

import butterknife.ButterKnife;

/**
 * Created by renjibo on 2018/4/10.
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AutoLayoutActivity {
    protected T mPresenter;
    private CustomDialog customDialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.activities.add(this);

        //判断是否是mvp
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView((V) this);//因为之后所有的子类都要实现对应的View接口
        }

        //子类不需要设置id
        setContentView(provideContentViewId());
        ButterKnife.bind(this);

        excuteStatesBar();

        initView();
        initData();
        initListener();

    }

    //用于创建presenter和判断是否使用mvp模式
    protected abstract T createPresenter();

    //得到当前文件的布局文件id
    protected abstract int provideContentViewId();

    /**
     * 解决4.4设置状态栏颜色之后，布局内容嵌入状态栏位置问题
     */
    private void excuteStatesBar() {
        ViewGroup mviewGroup = getWindow().findViewById(Window.ID_ANDROID_CONTENT);
        View childAt = mviewGroup.getChildAt(0);
        if (childAt != null) {
            //注意不是设置 ContentView 的 FitsSystemWindows,
            // 而是设置 ContentView 的第一个子 View ，预留出系统 View 的空间.
            mviewGroup.setFitsSystemWindows(true);
        }

    }

    private void initView() {

    }

    private void initData() {

    }

    private void initListener() {
    }

    //显示提示框
    public Dialog showWaitingDialog(String tip) {
        hidewaittingdialog();
        View inflate = View.inflate(this, R.layout.dialog_waiting, null);
        if (!TextUtils.isEmpty(tip)) {
            ((TextView) inflate.findViewById(R.id.tvtip)).setText(tip);
            customDialog = new CustomDialog(this, inflate, R.style.MyDialog);
            customDialog.show();
            customDialog.setCancelable(false);
        }
        return customDialog;
    }

    //隐藏提示框
    private void hidewaittingdialog() {
        if (customDialog != null) {
            customDialog.dismiss();
            customDialog = null;
        }

    }

}
