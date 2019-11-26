package com.gooweb.pattern.iterator;

/**
 * @author sunteng
 * @create 2019-11-02 上午 11:27
 **/
public class Client {

    public void someOperation(){
        String[] names = {"张三","李四","王五"};

        //创建聚合对象
        Aggregate aggregate = new ConcreteAggregate(names);
        //循环输出聚合对象中值
        Iterator it = aggregate.createIterator();
        //首先设置迭代器到第一个元素
        it.first();
        while (!it.isDone()){
            //取出当前的元素来
            Object obj = it.currentItem();
            System.out.println("the obj = ==" + obj);
            it.next();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation();
    }
}
