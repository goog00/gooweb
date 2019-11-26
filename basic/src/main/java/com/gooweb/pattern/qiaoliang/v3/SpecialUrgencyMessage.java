package com.gooweb.pattern.qiaoliang.v3;

/**
 * @author sunteng
 * @date 2019-11-18 下午 8:53
 **/
public class SpecialUrgencyMessage extends AbstractMessage{

    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void hurry(String messageId){
        //执行催促的业务，发出催促的消息
    }

    public void sendMessage(String message,String toUser){
         message = "特急" + message;
         super.sendMessage(message,toUser);
    }
}

