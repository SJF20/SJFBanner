package com.shijingfeng.sjf_banner.banner.listener;

import android.view.View;

/**
 * Function: 适配器事件监听器
 * Author: ShiJingFeng
 * Date: 2019/10/7 15:57
 * Description:
 */
@FunctionalInterface
public interface OnItemEventListener {

    /**
     * 事件回调方法
     * @param view 点击的View
     * @param data 数据
     * @param position 位置
     * @param flag 标志
     */
    void onItemEvent(View view, Object data, int position, String flag);

}
