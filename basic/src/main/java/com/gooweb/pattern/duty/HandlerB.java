package com.gooweb.pattern.duty;

/**
 * @author steng
 * @description
 * @date 2020-04-15 12:04 下午
 **/
public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;

        if(!handled && successor != null){
            successor.handle();
        }
    }
}
