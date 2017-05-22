package com.move.apphelp.util;

import java.util.Collection;

/**
 * Created by cxj on 2017/5/20.
 * 用于检查的工具类
 */
public class Check {

    /**
     * 判断一个数组是不是为空
     *
     * @param obs
     * @return
     */
    public static boolean isEmpty(Object[] obs) {
        if (obs == null || obs.length == 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断集合是否为空
     *
     * @param list
     * @return
     */
    public static boolean isEmpty(Collection<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

}
