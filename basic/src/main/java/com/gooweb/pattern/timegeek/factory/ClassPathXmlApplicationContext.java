package com.gooweb.pattern.timegeek.factory;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author steng
 * @description
 * @date 2020-06-04 4:39 下午
 **/
public class ClassPathXmlApplicationContext implements ApplicationContext {

    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation){
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinitions(configLocation);
    }

    public void loadBeanDefinitions(String configLocation){
        InputStream in = null;

        try{
            in = this.getClass().getResourceAsStream("/" + configLocation);

            if(in == null){
                throw new RuntimeException("can not find config file: " + configLocation);
            }
            List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
            beansFactory.addBeanDefinitions(beanDefinitions);
        } finally {
            if(in != null){
                try{
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Override
    public Object getBean(String beanId) {
        return beansFactory.getBean(beanId);
    }
}
