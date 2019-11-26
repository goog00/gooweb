package com.gooweb.pattern.iterator;

/**
 * 具体的聚合对象，实现创建相应迭代器对象的功能
 * @author sunteng
 * @create 2019-11-02 上午 11:00
 **/
public class ConcreteAggregate extends Aggregate {

    /**
     * 示意，表示聚合对象的具体内容
     */
    private String[] ss = null;

    public ConcreteAggregate(String[] ss) {
        this.ss = ss;
    }

    @Override
    public Iterator createIterator() {
        //实现创建Iterator的工厂方法
        return new ConcreteIterator(this);
    }

    public Object get(int index){
        Object retObj = null;
        if(index <ss.length){
            retObj = ss[index];
        }
        return retObj;
    }

    /**
     * 获取聚合对象的大小
     * @return
     */
    public int size(){
        return this.ss.length;
    }

}
