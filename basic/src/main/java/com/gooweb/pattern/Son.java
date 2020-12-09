package com.gooweb.pattern;

/**
 * @author steng
 * @date 2020-11-24 10:43
 **/
public abstract class Son extends CommonDemo implements Father{
    @Override
    public void test() {
        test2();
        System.out.println("son 实现");
    }

}
