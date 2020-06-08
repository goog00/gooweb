package com.gooweb.pattern.timegeek.factory;

import java.io.InputStream;
import java.util.List;

/**
 * 配置文件解析类
 *
 * @author steng
 * @description
 * @date 2020-06-04 4:41 下午
 **/
public interface BeanConfigParser {

    List parse(InputStream inputStream);

    List parse(String configContent);
}
