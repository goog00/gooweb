package com.gooweb.pattern.observer.v2;

/**
 * 观察者，比如报纸的读者
 *
 * @author sunteng
 * @date 2019-11-22 上午 8:13
 **/
public interface Observer {

    /**
     * 被通知的方法
     * @param subject 具体的目标对象，可以获取报纸的内容
     */
    void update(Subject subject);
}
