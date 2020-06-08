package com.gooweb.event.jdkevent;

import java.util.EventListener;

/**
 * @author steng
 * @description 事件监听器抽象
 * @date 2020-05-26 11:33 上午
 **/
public interface TaskFinishEventListener extends EventListener {

    void onTaskFinish(TaskFinishEvent event);

}
