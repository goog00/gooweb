package com.googoo.pattern.duty;

/**
 * @author sunteng
 * @create 2018-10-20 下午 8:34
 **/
public class Son implements IHandler {
    @Override
    public void handleMessage(IWomen iWomen) {
        System.out.println("母亲的请示" + iWomen.getRequest());
        System.out.println("儿子的答复是同意");
    }
}
