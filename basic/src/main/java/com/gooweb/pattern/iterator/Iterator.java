package com.gooweb.pattern.iterator;

/**
 * 迭代器接口，定义访问和遍历元素的操作
 * @author sunteng
 * @create 2019-11-02 上午 10:48
 **/
public interface Iterator {

    /**
     * 移动到聚合对象的第一个位置
     */
    public void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    public void next();


    /**
     * 判断是否已经移动到聚合对象的最后一个位置
     *
     * @return true 表示已经移动到聚合对象的最后一个位置
     * false 表示没有移动到聚合对象的最后一个位置
     */

    public boolean isDone();

    public Object currentItem();
}
