package com.googoo.pattern.proxy;

/**
 * @author sunteng
 * @create 2018-10-19 下午 11:31
 **/
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    //代练登录
    @Override
    public void login(String user, String password) {
        gamePlayer.login(user,password);
    }

    //代练杀怪
    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
