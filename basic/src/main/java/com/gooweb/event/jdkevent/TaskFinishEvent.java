package com.gooweb.event.jdkevent;

import java.util.EventObject;

/**
 *  事件类型
 * @author steng
 * @description
 * @date 2020-05-26 11:32 上午
 **/
public class TaskFinishEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TaskFinishEvent(Object source) {
        super(source);
    }
}
