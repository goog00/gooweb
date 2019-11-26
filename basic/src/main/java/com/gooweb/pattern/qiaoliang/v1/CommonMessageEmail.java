package com.gooweb.pattern.qiaoliang.v1;

/**
 * 以E-Mail 的方式发送普通消息
 * @author sunteng
 * @date 2019-11-18 下午 8:24
 **/
public class CommonMessageEmail implements Message {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用E-Mail的方式，发送消息" + message + "给" + toUser);
    }
}
