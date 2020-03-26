package com.gooweb.pattern.state.impl;

import org.springframework.stereotype.Component;

/**
 *
 * 创建订单操作状态流转
 * @author steng
 * @description
 * @date 2020-03-26 3:04 下午
 **/
@Component

public class CreateOrderOperator extends AbstractOrderOperator {

    public CreateOrderOperator(){
        super.setStatus(1);
    }


    @Override
    public int handleEvent(int orderStatus, OrderStatusEnum orderStatusEnum) {
        if(orderStatus != OrderStatusEnum.CREATE_EVENT.status && orderStatus != OrderStatusEnum.ORDER_CANCEL.status){
            throw new IllegalArgumentException(String.format("create operation can't handle the status : %s",orderStatus));
        }

        System.out.println("进入创建订单状态扭转处理器");
        switch (orderStatus){
            case 1 :
                return OrderStatusEnum.FORMAL_EVENT.status;
            case 2 :
                return OrderStatusEnum.ORDER_CANCEL.status;
            default:
                return getStatus();

        }

    }
}
