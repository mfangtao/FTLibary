package com.fangtao.ftlibrary.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * gridView 自动计算高度
 * 作者：涛锅锅
 * 时间：下午2:16
 * 邮箱：mfangtao@qq.com
 */
public class FGridView  extends GridView {
    public FGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FGridView(Context context) {
        super(context);
    }

    public FGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int expandSpec = MeasureSpec.makeMeasureSpec(
                Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
