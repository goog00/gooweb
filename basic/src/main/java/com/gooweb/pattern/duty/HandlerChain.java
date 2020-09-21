package com.gooweb.pattern.duty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        ArrayList<Integer> list = new ArrayList<>();

        Iterator<Integer> iterator = list.iterator();
        iterator.remove();
    }


}
