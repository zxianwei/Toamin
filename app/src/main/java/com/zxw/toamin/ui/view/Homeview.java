package com.zxw.toamin.ui.view;

import com.zxw.toamin.model.ArticleBean;
import com.zxw.toamin.model.Bannerbean;

import java.util.List;

/**
 * 首页
 */
public interface Homeview {

    void showRefreshView(Boolean refresh);

    void getBannerDataSuccess(List<Bannerbean> bannerbeans);

    void getDataError(String message);

    void getRefreshDataSusccess(List<ArticleBean> data);

    void getMoreDataSuccess(List<ArticleBean> data);


}
