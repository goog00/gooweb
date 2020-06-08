package com.gooweb.event.springevent;

import org.springframework.context.ApplicationEvent;

import java.util.EventListener;

/**
 * @author steng
 * @description
 * @date 2020-05-26 3:39 下午
 **/
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
