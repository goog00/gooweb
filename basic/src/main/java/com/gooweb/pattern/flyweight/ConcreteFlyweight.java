package com.gooweb.pattern.flyweight;

/**
 * 享元对象
 * @author sunteng
 * @create 2019-11-04 上午 10:16
 **/
public class ConcreteFlyweight implements Flyweight{

    /**
     * 示例，描述内部状态
     */
    private String intrinsicState;

    /**
     * 构造方法，传入享元对象的内部状态的数据
     * @param intrinsicState
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理，可能会用到享元内部，外部的状态

    }
}
