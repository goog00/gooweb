package com.gooweb.pattern.observer.v1;

/**
 * 观察者接口
 *
 * @author sunteng
 * @date 2019-11-21 下午 8:53
 **/
public interface Observer {

    /**
     * 更新的接口
     * @param subject
     */
    public void update(Subject subject);

}
