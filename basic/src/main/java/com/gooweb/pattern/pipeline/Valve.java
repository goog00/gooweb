package com.gooweb.pattern.pipeline;

/**
 * 阀门
 *
 * @author sunteng
 * @date 2019-11-26 下午 10:53
 **/
public interface Valve {

    Valve getNext();

    void setNext(Valve valve);

    void invoke(String handling);

}
