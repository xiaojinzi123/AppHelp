package com.move.apphelp.listener;

import android.view.View;

/**
 * Created by cxj on 2017/5/19.
 * 自定义控件的时候经常要实现点击事件,如果是项目里面需要用到
 * 那就使用这个库中的这个
 */
public interface OnItemClickListener {

    /**
     * 点击事件回调
     *
     * @param view
     * @param position
     */
    void onItemClick(View view, int position);

}
