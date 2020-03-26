package com.gooweb.pattern.state.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 状态机前置激活类,在spring中扫描配置此类
 * 使用自定义注解标记对应的状态处理器和后置处理器并在初始化操作中完成对应的处理器的初始化
 * @author steng
 * @description
 * @date 2020-03-26 3:33 下午
 **/
@Component
public class Initialization implements BeanPostProcessor {

    @Resource
    private OrderStateManager manager;

    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {

        if(bean instanceof AbstractOrderOperator ){
            AbstractOrderOperator orderState = (AbstractOrderOperator) bean;
            manager.orderOperatorMaps.put(orderState.getStatus(),orderState);
        }

        if(bean instanceof AbstractOrderProcessor){
            AbstractOrderProcessor orderProcessor = (AbstractOrderProcessor) bean;
            manager.orderProcessorMaps.put(orderProcessor.getStatus(),orderProcessor);
        }
        return bean;
    }
}
