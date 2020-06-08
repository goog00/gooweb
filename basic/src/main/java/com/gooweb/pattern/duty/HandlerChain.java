package com.gooweb.pattern.duty;

/**
 * @author steng
 * @description
 * @date 2020-04-15 12:05 下午
 **/
public class HandlerChain {

    private Handler head = null;

    private Handler tail = null;

    public void addHandler(Handler handler){
        handler.setSuccessor(null);

        if(head == null){
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;


    }

    public void handle(){
        if(head != null){
            head.handle();
        }
    }


}
