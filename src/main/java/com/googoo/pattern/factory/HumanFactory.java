package com.googoo.pattern.factory;

/**
 * @ClassName HumanFactory
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:21
 * @Version 1.0
 **/
public class HumanFactory  extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("人种生产错误");
        }
        return (T) human;
    }
}
