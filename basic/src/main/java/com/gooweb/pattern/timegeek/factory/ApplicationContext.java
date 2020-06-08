package com.gooweb.pattern.timegeek.factory;

/**
 * @author steng
 * @description
 * @date 2020-06-04 4:39 下午
 **/
public interface ApplicationContext {

    Object getBean(String beanId);
}
