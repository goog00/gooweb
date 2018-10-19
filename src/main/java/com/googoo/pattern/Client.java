package com.googoo.pattern;

/**
 * 测试客户端
 *
 * @author
 * @create 2018-09-07 上午 9:31
 **/
public class Client {
    public static void main(String[] args) {
        Driver zhangsan = new Driver();
        Benz benz = new Benz();
        zhangsan.drive(benz);
    }
}
