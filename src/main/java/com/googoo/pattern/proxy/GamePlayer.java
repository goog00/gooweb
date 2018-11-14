package com.googoo.pattern.proxy;

/**
 * @author sunteng
 * @create 2018-10-19 下午 11:20
 **/
public class GamePlayer implements IGamePlayer {

    private String name = "";

    //通过构造函数传递名称
    public GamePlayer(String name) {
        this.name = name;
    }

    //进游戏之前你肯定要登录吧，这是一个必要条件
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + " 用户" + this.name + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升一级");
    }
}
