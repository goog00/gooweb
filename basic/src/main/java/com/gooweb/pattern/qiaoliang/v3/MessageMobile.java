package com.gooweb.pattern.qiaoliang.v3;

/**
 * @author sunteng
 * @date 2019-11-18 下午 8:56
 **/
public class MessageMobile implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式发送" + message + "to " + toUser);
    }
}
