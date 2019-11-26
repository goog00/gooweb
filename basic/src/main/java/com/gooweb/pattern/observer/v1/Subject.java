package com.gooweb.pattern.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象,它知道观察它的观察者，并提供注册和删除观察者的接口
 * @author sunteng
 * @date 2019-11-21 下午 8:49
 **/
public class Subject {


    /**
     * 用来保存注册的观察对象
     */
    private List<Observer> observers = new ArrayList<>();


    /**
     * 注册观察者对象
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    protected void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }

}
