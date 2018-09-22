package com.googoo.pattern.factory;

/**
 * @ClassName BlackHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:15
 * @Version 1.0
 **/
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种 黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话，一般听不懂");
    }
}
