package com.googoo.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author sunteng
 * @create 2018-11-10 下午 12:24
 **/
public class MultiThread {
    public static void main(String[] args) {

        //获取java线程管理MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        //不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);

        //遍历线程信息，仅打印线程id 和 线程名称信息
        for(ThreadInfo threadInfo : threadInfos){
            System.out.println("[" + threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
        }

    }
}
