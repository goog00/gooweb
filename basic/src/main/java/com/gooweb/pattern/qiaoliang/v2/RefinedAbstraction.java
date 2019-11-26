package com.gooweb.pattern.qiaoliang.v2;

/**
 * @author sunteng
 * @date 2019-11-18 下午 8:39
 **/
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }


    /**
     * 实现一定的功能
     */
    public void otherOperation(){
        //实现一定的功能，可能会使用具体实现部分的实现方法，
        //但是本方法更大的可能是使用Abstraction中定义的方法
        //通过组合使用Abstraction中定义的方法来完成更多的功能
    }
}
