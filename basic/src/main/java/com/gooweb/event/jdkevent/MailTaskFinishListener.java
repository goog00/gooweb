package com.gooweb.event.jdkevent;

import lombok.Data;

/**
 * @author steng
 * @description
 * @date 2020-05-26 11:36 上午
 **/
@Data
public class MailTaskFinishListener implements TaskFinishEventListener {


    private String email;

    @Override
    public void onTaskFinish(TaskFinishEvent event) {
        System.out.println("send email to " + email + " Task:" + event.getSource());
    }

    public MailTaskFinishListener(String email) {
        this.email = email;
    }
}
