package com.googoo.pattern.single;

/**
 * @ClassName MinisterExt
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 19:59
 * @Version 1.0
 **/
public class MinisterExt {

    public static void main(String[] args) {
        //定义5个大臣
        int ministerNum = 5;
        for(int i = 0 ; i < ministerNum; i++){
            EmperorExt emperorExt = EmperorExt.getInstance();
            System.out.println("第" + (i + 1) + "个大臣参拜的是；");
            emperorExt.say();
        }
    }
}
