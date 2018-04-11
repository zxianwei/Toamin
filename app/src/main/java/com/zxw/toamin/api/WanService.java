package com.zxw.toamin.api;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okrx2.adapter.ObservableBody;
import com.zxw.toamin.app.Appconst;
import com.zxw.toamin.helper.JsonConvert;
import com.zxw.toamin.model.Bannerbean;
import com.zxw.toamin.model.ResponseData;

import java.util.List;

/**
 * api 接口
 */
public class WanService {

    private static final String homebanner = Appconst.BaseUrl + "banner/json";

    /**
     * 首页banner
     */

//    public static Observable<ResponseData<List<Bannerbean>>> getbanner() {
//        return OkGo.<ResponseData<List<Bannerbean>>>get(homebanner)
//                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)
//                .converter(new JsonConvert<ResponseData<List<Bannerbean>>>())
//                .adapt(new Observable<ResponseData<List<Bannerbean>>>());
//
//    }

    /**
     * 首页Banner
     *
     * @GET("/banner/json")
     */
    public static io.reactivex.Observable<ResponseData<List<Bannerbean>>> getBannerData() {
        return OkGo.<ResponseData<List<Bannerbean>>>get(homebanner)
                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)
                .converter(new JsonConvert<ResponseData<List<Bannerbean>>>() {
                })
                .adapt(new ObservableBody<ResponseData<List<Bannerbean>>>());
    }

}
