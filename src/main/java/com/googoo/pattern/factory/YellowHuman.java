package com.googoo.pattern.factory;

/**
 * @ClassName YellowHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:16
 * @Version 1.0
 **/
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种，皮肤黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话，一般都是双字节");
    }
}
