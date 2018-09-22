package com.googoo.pattern.abstractfactory;

/**
 * @ClassName NvWaClient
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 21:04
 * @Version 1.0
 **/
public class NvWaClient {

    public static void main(String[] args) {
        //生产男性
        HumanFactory maleHumanFactory = new MaleFactory();
        //生产女性
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleyellowHuman = maleHumanFactory.createYellowHuman();
        Human femalyellowHuman = femaleHumanFactory.createYellowHuman();

        System.out.println("---生产一个黄色女性");
        femalyellowHuman.getColor();
        femalyellowHuman.getSex();
        femalyellowHuman.talk();
        System.out.println("----生产一个黄色男性");
        maleyellowHuman.getSex();
        maleyellowHuman.getColor();
        maleyellowHuman.talk();

    }
}
