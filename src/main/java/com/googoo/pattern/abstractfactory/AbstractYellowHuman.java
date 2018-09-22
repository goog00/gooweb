package com.googoo.pattern.abstractfactory;

/**
 * @ClassName AbstractYellowHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:53
 * @Version 1.0
 **/
public abstract class AbstractYellowHuman implements Human{

    public void getColor(){
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
