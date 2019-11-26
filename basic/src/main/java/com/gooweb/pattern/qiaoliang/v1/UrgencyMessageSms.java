package com.gooweb.pattern.qiaoliang.v1;

/**
 * 查看站内消息
 *
 * @author sunteng
 * @date 2019-11-18 下午 8:29
 **/
public class UrgencyMessageSms implements UrgencyMessage {
    @Override
    public Object watch(String messageId) {
        // 获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }

    @Override
    public void send(String message, String toUser) {
        message = "加急:" + message;
        System.out.printf("使用站内短消息方式，发送消息" + message + "给" + toUser);
    }
}
