package com.gooweb.pattern.flyweight;

/**
 * 享元接口，通过这个接口享元可以接受并作用于外部状态
 * @author sunteng
 * @create 2019-11-04 上午 10:15
 **/
public interface Flyweight {

    public void operation(String extrinsicState);
}
