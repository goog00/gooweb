package com.gooweb.pattern.flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author sunteng
 * @create 2019-11-04 上午 10:21
 **/
public class FlyweightFactory {

    /**
     * 缓存多个flyweight对象，这里只是示意一下
     */
    private Map<String,Flyweight> fsMap = new HashMap<>();

    public Flyweight getFlyweight(String key){

        //1:先从缓存中查找，是否
        Flyweight f = fsMap.get(key);

        //2:如果存在，这里返回相对应的flyweight对象
        if(f == null){
            //3:如果不存在
            //3.1: 创建一个新的Flyweight对象
            f = new ConcreteFlyweight(key);
            //3.2:把这个新的flyweight对象添加到缓存中
            fsMap.put(key,f);
            //3.3:然后返回这个新的flyweight对象

        }
        return f;
    }
}
