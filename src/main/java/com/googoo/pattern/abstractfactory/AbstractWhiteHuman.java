package com.googoo.pattern.abstractfactory;

/**
 * @ClassName AbstractWhiteHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:52
 * @Version 1.0
 **/
public abstract class AbstractWhiteHuman implements Human {
    //白色人种的皮肤颜色是白色的
    public void getColor(){
        System.out.println("白色人种的皮肤颜色是白色的！");
    }
    //白色人种讲话
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }
}
