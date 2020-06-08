package com.gooweb.pattern.timegeek.adapter.slf4j;

/**
 * @author steng
 * @description
 * @date 2020-06-05 12:28 下午
 **/
public class Log4jLoggerAdapter {

    final transient Logger logger;


    public Log4jLoggerAdapter(Logger logger) {
        this.logger = logger;
    }

    public boolean isDebugEnabled(){
        return logger.isDebugEnabled();
    }
}
