package com.gooweb.pattern.timegeek.template;

/**
 * @author steng
 * @description
 * @date 2020-06-05 2:52 下午
 **/
public class AClass {

    public static void main(String[] args) {
        BClass b = new BClass();
        b.process(new ICallback() {
            @Override
            public void methodToCallback() {
                System.out.println("call back me");
            }
        });
    }
}
