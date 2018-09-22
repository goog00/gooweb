package com.googoo.pattern.abstractfactory;


/**
 * @ClassName FemaleWhiteHuman
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:57
 * @Version 1.0
 **/
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("whilte female");
    }
}
