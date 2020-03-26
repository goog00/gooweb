package com.gooweb.pattern.state.impl;

/**
 * 订单处理器
 * @author steng
 * @description
 * @date 2020-03-26 3:29 下午
 **/
public class CreateOrderProcessor extends AbstractOrderProcessor {

    public CreateOrderProcessor(){
        super.setStatus(1);
    }

    @Override
    public boolean process(String orderId, Object... params) {
        //TODO 创建/取消订单对应的数据库修改,mq 发送等操作,可以在此处process方法中完成
        System.out.println("进入创建订单后处理器");
        return true;
    }
}
