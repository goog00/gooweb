package com.gooweb.pattern.state.impl;

import lombok.Data;

/**
 * @author steng
 * @description
 * @date 2020-03-26 3:02 下午
 **/
@Data
public abstract class AbstractOrderOperator {

    int status;

    public abstract int handleEvent(int orderStatus,OrderStatusEnum orderStatusEnum);

}
