package com.googoo.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author steng
 * @description
 * @date 2020-08-18 6:38 下午
 **/
public class MyFactoryBean implements FactoryBean<Object>, InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {

    }

    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
