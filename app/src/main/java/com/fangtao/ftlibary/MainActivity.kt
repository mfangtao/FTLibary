package com.fangtao.ftlibary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fangtao.ftlibrary.cache.FACache
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.addLogAdapter(AndroidLogAdapter())

//        Picasso.get().load("https://img.lzjpjy.com/user/portrait/544cf9239c3f3574df4aa5e6b5c60d39175c7480.jpg").into(iv)
//        Picasso.get().load(R.mipmap.ic_launcher).into(iv)
//        FACache.get(this).put("name", "content")
        Logger.d(FACache.get(this).getAsString("name"))
    }
}
