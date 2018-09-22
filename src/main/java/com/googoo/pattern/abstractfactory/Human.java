package com.googoo.pattern.abstractfactory;

/**
 * @ClassName Human
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:52
 * @Version 1.0
 **/
public interface Human {

    //每个人种都有相应的颜色
    public void getColor();
    //人类会说话
    public void talk();
    //每个人都有性别
    public void getSex();

}
