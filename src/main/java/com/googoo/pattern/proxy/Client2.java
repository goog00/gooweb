package com.googoo.pattern.proxy;

/**
 * @author sunteng
 * @create 2018-10-19 下午 11:33
 **/
public class Client2 {

    public static void main(String[] args) {
        //定义一个痴迷的玩家

        IGamePlayer player = new GamePlayer("张三");

        GamePlayerProxy playerProxy = new GamePlayerProxy(player);
        //
        playerProxy.login("zhangsan","");
        playerProxy.killBoss();
        playerProxy.upgrade();
        System.out.println("结束");
    }
}
