package com.gooweb.pattern.observer.v2;

/**
 * @author sunteng
 * @date 2019-11-22 上午 8:53
 **/
public class Client {

    public static void main(String[] args) {

        //创建一个报纸，作为被观察者
        NewsPaper newsPaper = new NewsPaper();
        //创建阅读者，也就是观察者
        Reader reader1 = new Reader();
        reader1.setName("张三");

        Reader reader2 = new Reader();
        reader2.setName("李四");

        Reader reader3 = new Reader();
        reader3.setName("王五");

        //注册阅读者
        newsPaper.attach(reader1);
        newsPaper.attach(reader2);
        newsPaper.attach(reader3);

        //要出报纸了
        newsPaper.setContent("本期内存是观察者模式");



    }
}
