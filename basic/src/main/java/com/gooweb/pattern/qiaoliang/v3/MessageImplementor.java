package com.gooweb.pattern.qiaoliang.v3;

/**
 * 实现发送消息的统一接口
 * @author sunteng
 * @date 2019-11-18 下午 8:43
 **/
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message 要发送的消息
     * @param toUser 消息发送的目的人员
     */
    public void send(String message,String toUser);

}
