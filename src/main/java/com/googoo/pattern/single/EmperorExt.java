package com.googoo.pattern.single;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName EmperorExt
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 19:26
 * @Version 1.0
 **/
public class EmperorExt {
    //定义最多能产生的实例个数
    private static int maxNumberOfEmperor = 2;
    //每个皇帝都有自己的名字
    private static ArrayList<String> nameList = new ArrayList<>();

    //定义一个列表，容纳所有的皇帝实例
    private static ArrayList<EmperorExt> emperorArrayList = new ArrayList<>();

    //当前皇帝序列号
    private static int countNumOfEmperor = 0;

    //产生所有的对象
    static {
        for(int i = 0; i  < maxNumberOfEmperor; i++){
            emperorArrayList.add(new EmperorExt("黄" + (i + 1) + "帝"));
        }
    }

    private EmperorExt(){

    }

    private EmperorExt(String name){
        nameList.add(name);
    }

    public static EmperorExt getInstance(){
        Random random = new Random();
        //随机拉出一个皇帝，只要是个精神领袖就好
        countNumOfEmperor = random.nextInt(maxNumberOfEmperor);
        return emperorArrayList.get(countNumOfEmperor);
    }
    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }






}
