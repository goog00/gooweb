package com.gooweb.pattern.observer.v1;

/**
 * 具体观察者对象，实现更新的方法，使自身的状态和目标状态保持一致
 *
 * @author sunteng
 * @date 2019-11-21 下午 8:54
 **/
public class ConcreteObserver implements Observer {


    private String observerState;


    /**
     * 示意，观察的状态
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        // 具体的更新实现
        //这里能需要更新观察者的状态，使其与目标的状态保持一致
        observerState = ((ConcreteSubject)subject).getSubjectState();

    }
}
