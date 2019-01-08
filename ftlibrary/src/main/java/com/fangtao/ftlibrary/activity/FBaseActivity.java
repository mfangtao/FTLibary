package com.fangtao.ftlibrary.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * 作者：涛锅锅
 * 时间：13:16
 * 邮箱：mfangtao@qq.com
 */
public class FBaseActivity extends AppCompatActivity {
    private ProgressDialog pDialog;

    /**
     * 显示加载等待
     * 作者：涛锅锅
     * 时间：2019/1/3 13:25
     * 邮箱：mfangtao@qq.com
     */
    public void FshowLoading(){
        if (pDialog == null)
        {
            pDialog = ProgressDialog.show(this,null,"加载中...");
        }else{
            pDialog.show();
        }
    }
    /**
     * 隐藏加载等待
     * 作者：涛锅锅
     * 时间：2019/1/3 13:25
     * 邮箱：mfangtao@qq.com
     */
    public void FdismissLoading(){
        if (pDialog!=null)
        {
            pDialog.dismiss();
        }
    }
    /**
     * 显示Dialog
     * 作者：涛锅锅
     * 时间：2019/1/3 13:26
     * 邮箱：mfangtao@qq.com
     */
    public void FshowDialog(String msg){
        new AlertDialog.Builder(this)
                .setTitle("温馨提示")
                .setMessage(msg)
                .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();
    }
    /**
     * 日志
     * 作者：涛锅锅
     * 时间：2019/1/3 13:26
     * 邮箱：mfangtao@qq.com
     */
    public void FshowLog(String msg){
        Log.i(getTitle().toString(),"----TGG----"+msg);
    }
    /**
     * 日志
     * 作者：涛锅锅
     * 时间：2019/1/3 13:26
     * 邮箱：mfangtao@qq.com
     */
    public void FshowLog(String TAG,String msg){
        Log.i(getTitle().toString(),TAG+"----TGG----"+msg);
    }
    /**
     * 显示toast
     * 作者：涛锅锅
     * 时间：2019/1/3 13:26
     * 邮箱：mfangtao@qq.com
     */
    public void FshowToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
