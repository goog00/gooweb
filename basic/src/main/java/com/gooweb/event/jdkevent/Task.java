package com.gooweb.event.jdkevent;

import lombok.Data;

/**
 *
 *
 * 事件源
 * @author steng
 * @description
 * @date 2020-05-26 11:30 上午
 **/
@Data
public class Task {

    private String name;

    private TaskFinishStatus status;

    public Task(String name, TaskFinishStatus status) {
        this.name = name;
        this.status = status;
    }
}
