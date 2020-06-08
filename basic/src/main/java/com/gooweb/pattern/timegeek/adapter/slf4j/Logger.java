package com.gooweb.pattern.timegeek.adapter.slf4j;

/**
 * @author steng
 * @description slf4j统一的接口定义
 * @date 2020-06-05 12:26 下午
 **/
public interface Logger {

    public boolean isTraceEnabled();

    public void trace(String msg);


    public void trace(String format, Object arg);

    public void trace(String format, Object arg1, Object arg2);

    public void trace(String format, Object[] argArray);

    public void trace(String msg, Throwable t);

    public boolean isDebugEnabled();

    public void debug(String msg);

    public void debug(String format, Object arg);

    public void debug(String format, Object arg1, Object arg2);

    public void debug(String format, Object[] argArray);

    public void debug(String msg, Throwable t);
}
