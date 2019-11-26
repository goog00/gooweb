package com.gooweb.pattern.flyweight;

/**
 * @author sunteng
 * @create 2019-11-04 上午 10:20
 **/
public class UnsharedConcreteFlyweight implements Flyweight{

    /**
     * 示例，描述对象的状态
     */
    private String allState;

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理

    }
}
