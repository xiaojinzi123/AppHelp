package com.move.apphelp.listener;

/**
 * Created by cxj on 2017/5/22.
 * 监听内容的通知
 */
public interface OnContentListener<T> {

    /**
     * 通知
     *
     * @param t
     */
    void onNotify(T t);

}
