package com.googoo.pattern.duty.one;

/**
 * @author sunteng
 * @create 2018-10-20 下午 8:24
 **/
public interface IWomen {

    //获得个人情况
    public int getType();

    //获得个人请示，你要干什么？出去逛街？约会？还是看电影？
    public String getRequest();
}
