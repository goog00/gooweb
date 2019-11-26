package com.gooweb.pattern.pipeline;

/**
 * 管道
 *
 * @author sunteng
 * @date 2019-11-26 下午 10:55
 **/
public interface Pipeline {

    Valve getFirst();

    Valve getBasic();

    void setBasic(Valve valve);

    void addValve(Valve valve);
}
