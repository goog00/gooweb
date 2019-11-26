package com.gooweb.pattern.qiaoliang.v3;

/**
 * @author sunteng
 * @date 2019-11-18 下午 8:48
 **/
public class MessageEmail implements  MessageImplementor
{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用E-Mail的方式，发送消息" + message + "to " + toUser);
    }
}
