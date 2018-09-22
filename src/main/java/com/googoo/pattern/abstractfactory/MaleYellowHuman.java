package com.googoo.pattern.abstractfactory;

/**
 * @ClassName MaleYellowHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:55
 * @Version 1.0
 **/
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄种男性");
    }
}
