package com.gooweb.pattern.qiaoliang.v1;

/**
 * 消息的统一接口
 *
 * @author sunteng
 * @date 2019-11-18 下午 6:47
 **/
public interface Message {

    /**
     * 发送消息
     * @param message
     * @param toUser
     */
    void send(String message,String toUser);
}
