package com.googoo.common.basic;

import java.util.Arrays;

/**
 * @author sunteng
 * @create 2018-10-27 下午 4:48
 **/
public class Test2 {

    private Demo demo = new Demo();

    public Demo create(){
        demo.setList(Arrays.asList(1,2,3,4,5));
        return demo;
    }

    public Demo getDemo() {

        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }
}
