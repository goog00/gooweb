package com.gooweb.pattern.qiaoliang.v1;



/**
 * 加急消息的抽象接口
 * @author sunteng
 * @date 2019-11-18 下午 8:26
 **/
public interface UrgencyMessage extends Message {

    /**
     * 监控某消息的处理过程
     * @param messageId 被监控消息的编号
     * @return 包含监控到的数据对象
     */
     Object watch(String messageId);

}
