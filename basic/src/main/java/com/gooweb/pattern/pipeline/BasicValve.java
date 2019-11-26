package com.gooweb.pattern.pipeline;

/**
 * 基础阀
 *
 * @author sunteng
 * @date 2019-11-26 下午 10:56
 **/
public class BasicValve implements Valve {

    protected Valve next = null;

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
        handling = handling.replaceAll("aa","bb");
        System.out.println("基础阀门处理完后：" + handling);
    }
}
