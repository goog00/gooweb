package com.googoo.pattern.factory;

/**
 * @ClassName WhiteHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:18
 * @Version 1.0
 **/
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是单字节的");
    }
}
