package com.googoo.pattern.abstractfactory;

/**
 * @ClassName BlackHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:59
 * @Version 1.0
 **/
public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
