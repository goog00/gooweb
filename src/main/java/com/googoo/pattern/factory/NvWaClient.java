package com.googoo.pattern.factory;

/**
 * @ClassName NvWaClient
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:24
 * @Version 1.0
 **/
public class NvWaClient {

    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory yinyanglu = new HumanFactory();

        //女娲第一次造人，火候不足，于是白人产生了
        System.out.println("--造出的第一批人是白色人种--");
        WhiteHuman whiteHuman = yinyanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //女娲第二次造人，火候过足，于是黑人产生了
        System.out.println("\n--造出的第二批人是黑色人种--");
        BlackHuman blackHuman = yinyanglu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("\n--造出的第三批人是黄色人种--");
        YellowHuman yellowHuman = yinyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();


    }
}
