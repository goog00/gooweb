package com.gooweb.pattern.pipeline;

/**
 * 第二个阀门
 * @author sunteng
 * @date 2019-11-26 下午 10:58
 **/
public class SecondValve implements Valve{

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
        handling = handling.replaceAll("11","22");
        System.out.println("Second 阀门处理完成后：" + handling);
        getNext().invoke(handling);
    }

}
