package com.gooweb.pattern.qiaoliang.v3;

/**
 * @author sunteng
 * @date 2019-11-18 下午 8:50
 **/
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message,String toUser){
         message = "加急" + message;
         super.sendMessage(message,toUser);
    }

    /**
     * 扩展自己的新功能，监控消息的处理过程
     * @param messageId 被监控消息的id
     * @return
     */
    public Object watch(String messageId){
        return null;
    }
}
