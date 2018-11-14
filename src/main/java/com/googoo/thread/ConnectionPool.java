package com.googoo.thread;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author sunteng
 * @create 2018-11-14 下午 8:03
 **/
public class ConnectionPool {

    private LinkedList<Connection> pool = new LinkedList<>();

    public ConnectionPool(int initialSize){
        if(initialSize > 0){
            for(int i = 0; i < initialSize; i++){
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }
}
