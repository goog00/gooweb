package com.gooweb.pattern.pipeline;

/**
 * 第三个阀门
 *
 * @author sunteng
 * @date 2019-11-26 下午 11:01
 **/
public class ThirdValve implements Valve {

    protected Valve next;

    @Override
    public Valve getNext() {
        return next;
    }

    @Override
    public void setNext(Valve valve) {
        next = valve;
    }

    @Override
    public void invoke(String handling) {
        handling = handling.replaceAll("zz","yy");
        System.out.println("Third 阀门处理完成后：" + handling);
        getNext().invoke(handling);
    }
}
