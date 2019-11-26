package com.gooweb.pattern.observer.v2;

/**
 * 真正的读者
 *
 * @author sunteng
 * @date 2019-11-22 上午 8:30
 **/
public class Reader implements Observer{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，阅读他，内容是" + ((NewsPaper)subject).getContent());
    }
}
