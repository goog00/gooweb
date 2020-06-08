package com.gooweb.event.jdkevent;

/**
 * @author steng
 * @description
 * @date 2020-05-26 2:39 下午
 **/
public class TestTaskFinishListener {

    public static void main(String[] args){

        //事件源
        Task source = new Task("用户统计",TaskFinishStatus.SUCCEDD);

        //任务结束事件
        TaskFinishEvent event = new TaskFinishEvent(source);

        //邮件服务监听器
        MailTaskFinishListener mailTaskFinishListener = new MailTaskFinishListener("teng.sun@rograndec.com");

        //事件发布器
        TaskFinishEventPublisher publisher = new TaskFinishEventPublisher();

        //注册邮件服务监听器
        publisher.register(mailTaskFinishListener);

        //发布事件
        publisher.publishEvent(event);

    }
}
