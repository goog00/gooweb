package com.googoo.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * 我的调度器
 *
 * @author sunteng
 * @create 2018-10-08 下午 1:19
 **/
public class MyScheduler {
    public static void main(String[] args) throws SchedulerException {
        //创建调度器
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        //创建jobdetail,并与printwordsJob 绑定
        JobDetail jobDetail = JobBuilder.newJob(PrintWordsJob.class).withIdentity("job1","group1").build();

        //构建trigger触发器，每隔1s执行一次
        SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggergroup1")
                .startNow()//立即生效
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1)//每隔1s 执行
                        .repeatForever()).build();


        //执行
        scheduler.scheduleJob(jobDetail,trigger);
        System.out.println("--------------scheduler start------------------");

        scheduler.start();


//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        scheduler.shutdown();

    }
}
