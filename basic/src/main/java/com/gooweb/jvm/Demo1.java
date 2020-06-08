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
     * -XX:NewSize=5242880           初始新生代大小5m
     * -XX:MaxNewSize=5242880        最大新生代大小 5m
     * -XX:InitialHeapSize=10485760  初始堆大小 10m
     * -XX:MaxHeapSize=10485760      最大堆大小 10m
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
        /**
         *  根据jvm 启动参数:
         *   eden:4m
         *   s0:0.5m
         *   s1:0.5m
         *   old:5m
         *
         */

        byte[] array1 = new byte[6*1024 * 1024];//1m
        array1 = new byte[1024 * 1024];//1m
        array1 = new byte[1024 * 1024];//1m
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];//2m

    }

    /**
     * Java HotSpot(TM) 64-Bit Server VM (25.191-b12) for bsd-amd64 JRE (1.8.0_191-b12), built on Oct  6 2018 08:37:07 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
     * Memory: 4k page, physical 33554432k(3659956k free)
     *
     * /proc/meminfo:
     *
     * CommandLine flags: -XX:InitialHeapSize=10485760 -XX:MaxHeapSize=10485760 -XX:MaxNewSize=5242880 -XX:NewSize=5242880 -XX:OldPLABSize=16 -XX:PretenureSizeThreshold=10485760 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:SurvivorRatio=8 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:+UseParNewGC
     * 0.118: [GC (Allocation Failure) 0.118: [ParNew: 3635K->512K(4608K), 0.0015616 secs] 3635K->1756K(9728K), 0.0016217 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     * 0.120: [GC (Allocation Failure) 0.120: [ParNew: 2680K->215K(4608K), 0.0018091 secs] 3924K->1970K(9728K), 0.0018394 secs] [Times: user=0.00 sys=0.01, real=0.01 secs]
     * Heap
     *  par new generation   total 4608K, used 2332K [0x00000007bf600000, 0x00000007bfb00000, 0x00000007bfb00000)
     *   eden space 4096K,  51% used [0x00000007bf600000, 0x00000007bf811450, 0x00000007bfa00000)
     *   from space 512K,  41% used [0x00000007bfa00000, 0x00000007bfa35c28, 0x00000007bfa80000)
     *   to   space 512K,   0% used [0x00000007bfa80000, 0x00000007bfa80000, 0x00000007bfb00000)
     *  concurrent mark-sweep generation total 5120K, used 1755K [0x00000007bfb00000, 0x00000007c0000000, 0x00000007c0000000)
     *  Metaspace       used 2939K, capacity 4496K, committed 4864K, reserved 1056768K
     *   class space    used 319K, capacity 388K, committed 512K, reserved 1048576K
     */
    /**
     * 0.118: [GC (Allocation Failure) :
     *    Allocation Failure:对象分配堆内存分配失败,触发一次YGC
     *    0.118:系统运行0.118秒后触发YGC
     *
     * [ParNew: 3635K->512K(4608K), 0.0015616 secs]
     *     ParNew : ParNew垃圾回收器
     *     (4608K): 年轻代可用空间4608K=4.5m
     *     3635K->512K:年轻代gc前使用了3635K,YGC后512k对象幸存下来,进入了S0区
     *     0.0015616 secs : 本次gc 耗时
     *
     * 3635K->1756K(9728K), 0.0016217 secs
     *     (9728K): Java 堆内存可用空间 9.5m
     *     3635K : GC前整个堆内存中使用了 3635K
     *     1756K : GC 后 Java堆内存使用了1756K
     *
     *  [Times: user=0.00 sys=0.00, real=0.00 secs]
     *  本次GC 耗时
     *
     */
}
