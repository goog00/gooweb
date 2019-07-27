package com.googoo.pattern.duty.one;

/**
 * @author sunteng
 * @create 2018-10-20 下午 8:30
 **/
public class Father implements IHandler{
    @Override
    public void handleMessage(IWomen iWomen) {
        System.out.println("女儿的请示" + iWomen.getRequest());
        System.out.println("父亲的答复： 同意");
    }
}
