package com.gooweb.pattern.iterator;


/**
 * 具体的迭代对器实现对象，示意的是聚合对象为数组的迭代器，不同的聚合对象相应的迭代器实现不一样的
 * @author sunteng
 * @create 2019-11-02 上午 10:52
 **/
public class ConcreteIterator implements Iterator {


    private ConcreteAggregate aggregate;

    /**
     * 内部索引，记录当前迭代到索引位置
     * -1表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = -1;


    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < this.aggregate.size()){
            index = index + 1;
        }

    }

    @Override
    public boolean isDone() {
        if(index == this.aggregate.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
