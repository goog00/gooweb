package com.gooweb.jvm;

/**
 * @author steng
 * @description
 * @date 2020-01-07 7:24 下午
 **/
public class Demo1 {
    /**
     * -XX:NewSize=5242880 -XX:MaxNewSize=5242880 -XX:InitialHeapSize=10485760 -XX:MaxHeapSize=10485760 -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=10485760 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log
     *
     * -XX:NewSize=5242880           初始新生代大小
     * -XX:MaxNewSize=5242880        最大新生代大小
     * -XX:InitialHeapSize=10485760  初始堆大小
     * -XX:MaxHeapSize=10485760      最大堆大小
     * -XX:SurvivorRatio=8
     * -XX:PretenureSizeThreshold=10485760   大对象阈值是10mb
     * -XX:+UseParNewGC
     * -XX:+UseConcMarkSweepGC
     * -XX:+PrintGCDetails           打印详细的gc日志
     * -XX:+PrintGCTimeStamps        打印出每次gc发生的时间
     * -Xloggc:gc.log                gc日志写入一个磁盘文件
     *
     */
    public static void main(String[] args) {
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];

    }
}
