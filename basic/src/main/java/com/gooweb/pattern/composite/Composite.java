package com.gooweb.pattern.composite;

import java.util.ArrayList;

/**
 * 树枝构件
 * @author sunteng
 * @date 2019-11-26 上午 8:44
 **/
public class Composite extends Component{

    /**
     * 构建的容器
     */
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    /**
     * 增加一个叶子构件或树枝构件
     */
    public void add(Component component){
        this.componentArrayList.add(component);
    }

    /**
     * 删除一个叶子构件或树枝构件
     * @param component
     */
    public void remove(Component component){
        this.componentArrayList.remove(component);
    }

    /**
     * 获得分支下的所有叶子构件和树枝构件
     * @return
     */
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }

}
