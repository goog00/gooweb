package com.googoo.pattern.single;

/**
 * @ClassName Minister
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 19:11
 * @Version 1.0
 **/
public class Minister {

    public static void main(String[] args) {
        for(int day = 0; day < 3; day++){
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
