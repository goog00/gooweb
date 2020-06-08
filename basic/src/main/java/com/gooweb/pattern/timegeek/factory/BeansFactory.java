package com.gooweb.pattern.timegeek.factory;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * bean 工厂
 *
 * @author steng
 * @description
 * @date 2020-06-04 4:45 下午
 **/
public class BeansFactory {

    private ConcurrentHashMap<String, Object> singletonObject = new ConcurrentHashMap<>();

    private ConcurrentHashMap<String, BeanDefinition> beanDefinitions = new ConcurrentHashMap<>();

    public void addBeanDefinitions(List<BeanDefinition> beanDefinitionList) {
        for (BeanDefinition beanDefinition : beanDefinitionList) {
            this.beanDefinitions.putIfAbsent(beanDefinition.getId(), beanDefinition);
        }

        for (BeanDefinition beanDefinition : beanDefinitionList) {
            if (beanDefinition.isLazyInit() == false && beanDefinition.isSingleton()) {
               createBean(beanDefinition);
            }
        }
    }

    public Object getBean(String beanId){
        BeanDefinition beanDefinition = beanDefinitions.get(beanId);
        if(beanDefinition == null){
            throw new NoSuchBeanDefinitionException("");
        }
       return createBean(beanDefinition);
    }

    protected Object createBean(BeanDefinition beanDefinition) {
        if (beanDefinition.isSingleton() && singletonObject.containsKey(beanDefinition.getId())) {
            return singletonObject.get(beanDefinition.getId());
        }

        Object bean = null;

        try {
            Class beanClass = Class.forName(beanDefinition.getClassName());
            List<BeanDefinition.ConstructorArg> constructorArgs = beanDefinition.getConstructorArgs();
            if (constructorArgs.isEmpty()) {
                bean = beanClass.newInstance();
            } else {
                Class[] argClasses = new Class[constructorArgs.size()];
                Object[] argObjects = new Object[constructorArgs.size()];

                for (int i = 0; i < constructorArgs.size(); ++i) {
                    BeanDefinition.ConstructorArg arg = constructorArgs.get(i);

                    if (!arg.isRef()) {
                        argClasses[i] = arg.getType();
                        argObjects[i] = arg.getArg();
                    } else {
                        BeanDefinition refBeanDefinition = beanDefinitions.get(arg.getArg());
                        if (refBeanDefinition == null) {
                            throw new NoSuchBeanDefinitionException("Bean is not defined: " + arg.getArg());
                        }
                        argClasses[i] = Class.forName(refBeanDefinition.getClassName());
                        argObjects[i] = createBean(refBeanDefinition);
                    }

                }
                bean = beanClass.getConstructor(argClasses).newInstance(argObjects);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if(bean != null && beanDefinition.isSingleton()){
            singletonObject.putIfAbsent(beanDefinition.getId(),bean);
            return singletonObject.get(beanDefinition.getId());
        }

        return bean;


    }
}
