package com.googoo.pattern.abstractfactory;

/**
 * @ClassName AbstractBlackHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:53
 * @Version 1.0
 **/
public abstract class AbstractBlackHuman implements Human{
    public void getColor(){
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
