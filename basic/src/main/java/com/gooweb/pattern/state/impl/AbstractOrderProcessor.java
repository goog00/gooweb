package com.gooweb.pattern.state.impl;

import lombok.Data;

/**
 * @author steng
 * @description 订单处理器
 * @date 2020-03-26 3:24 下午
 **/
@Data
public abstract class AbstractOrderProcessor {

    int status;

    public abstract boolean process(String orderId,Object... params);
}
