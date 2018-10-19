package com.googoo.pattern.template;

/**
 * client
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:38
 **/
public class Client {

    public static void main(String[] args) {
        HummerModel hi = new HummerH1Model();
        ((HummerH1Model) hi).setAlarmFlag(false);
        hi.run();

        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
