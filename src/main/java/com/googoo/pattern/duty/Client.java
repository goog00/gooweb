package com.googoo.pattern.duty;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author sunteng
 * @create 2018-10-20 下午 8:36
 **/
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            arrayList.add(new Women(random.nextInt(4),"我要去逛街"));
        }

        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for(IWomen women : arrayList){
            if(women.getType() == 1){
                //未婚少女，请示父亲
                System.out.println("女儿向父亲请示--");
                father.handleMessage(women);
            } else if(women.getType() == 2) {
                //已婚
                System.out.printf("妻子向丈夫请示");
                husband.handleMessage(women);
            } else if(women.getType() == 3) {
                System.out.println("母亲向儿子请示---");
                son.handleMessage(women);
            }
        }

    }
}
