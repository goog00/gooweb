package com.gooweb.pattern.qiaoliang.v3;

/**
 * @author sunteng
 * @date 2019-11-18 下午 8:49
 **/
public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message,String toUser){
        super.sendMessage(message,toUser);
    }
}
