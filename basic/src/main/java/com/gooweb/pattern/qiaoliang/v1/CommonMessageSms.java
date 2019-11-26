package com.gooweb.pattern.qiaoliang.v1;

/**
 * 以站内短消息的形式发送普通消息
 * @author sunteng
 * @date 2019-11-18 下午 8:23
 **/
public class CommonMessageSms implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用站内短消息的方式，发送消息" + message + "给," + toUser);
    }
}
