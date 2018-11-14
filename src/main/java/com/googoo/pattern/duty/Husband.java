package com.googoo.pattern.duty;

/**
 * @author sunteng
 * @create 2018-10-20 下午 8:33
 **/
public class Husband implements IHandler {
    @Override
    public void handleMessage(IWomen iWomen) {
        System.out.println("妻子的请示" + iWomen.getRequest());
        System.out.println("丈夫的答复同意");
    }
}
