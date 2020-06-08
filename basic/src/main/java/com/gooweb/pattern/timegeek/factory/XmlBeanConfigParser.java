package com.gooweb.pattern.timegeek.factory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author steng
 * @description xml 解析器
 * @date 2020-06-04 5:04 下午
 **/
public class XmlBeanConfigParser implements BeanConfigParser {

    @Override
    public List parse(InputStream inputStream) {
        String content = null;
        return parse(content);
    }

    @Override
    public List parse(String configContent) {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();
        return beanDefinitions;
    }
}
