package com.googoo.pattern.abstractfactory;

/**
 * @ClassName FemaleYellowHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:54
 * @Version 1.0
 **/
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄种女性");
    }
}
