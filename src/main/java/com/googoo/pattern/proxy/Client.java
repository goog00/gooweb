package com.googoo.pattern.proxy;

/**
 * @author sunteng
 * @create 2018-10-19 下午 11:24
 **/
public class Client {

    public static void main(String[] args) {
        //定义一个痴迷的玩家

        IGamePlayer player = new GamePlayer("张三");
        //
        player.login("zhangsan","");
        player.killBoss();
        player.upgrade();
        System.out.println("结束");
    }
}
