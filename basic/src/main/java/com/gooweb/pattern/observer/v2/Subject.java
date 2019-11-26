package com.gooweb.pattern.observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，作为被观察者
 *
 * @author sunteng
 * @date 2019-11-22 上午 8:12
 **/
public class Subject {


    /**
     * 用来保存注册的观察者对象，也就是报纸的订阅者
     */
    private List<Observer> readers = new ArrayList<>();


    /**
     * 报纸的读者需要向报社订阅，先注册
     * @param reader
     */
    public void attach(Observer reader){
        readers.add(reader);
    }


    /**
     * 报纸的读者可以取消订阅
     * @param reader
     */
    public void detach(Observer reader){
        readers.remove(reader);
    }


    protected void notifyObservers(){
        for(Observer reader : readers){
            reader.update(this);
        }
    }


}
