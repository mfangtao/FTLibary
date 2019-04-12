package com.fangtao.ftlibrary;

import android.app.Application;

import com.fangtao.ftlibrary.cache.FACache;
import com.fangtao.ftlibrary.gson.NullStringEmptyTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ohmerhe.kolley.request.Http;

/**
 * 作者：涛锅锅
 * 时间：15:15
 * 邮箱：mfangtao@qq.com
 */
public class FBaseApplication extends Application {
    public static Gson gson = new GsonBuilder().registerTypeAdapterFactory(new NullStringEmptyTypeAdapterFactory()).create();
    @Override
    public void onCreate() {
        super.onCreate();
        Http.INSTANCE.init(this);
    }


}
