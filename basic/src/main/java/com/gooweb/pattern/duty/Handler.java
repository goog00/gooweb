package com.gooweb.pattern.duty;

/**
 * @author steng
 * @description
 * @date 2020-04-15 12:02 下午
 **/
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handle();

}
