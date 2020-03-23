package com.gooweb.thread.test;

import com.sun.codemodel.internal.JCommentPart;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * @author steng
 * @description
 * @date 2020-02-27 7:17 上午
 **/
public class MyThreadPool {

    //利用阻塞队列实现生产者-消费者模式
    BlockingQueue<Runnable> workQueue ;

    //
    List<WorkerThread> threads = new ArrayList<>();

    MyThreadPool(int poolSize,BlockingQueue<Runnable> workQueue){
        this.workQueue = workQueue;
        //创建工作线程
        for(int idx = 0; idx < poolSize ;idx++){
            WorkerThread work = new WorkerThread();
            work.start();
            threads.add(work);
        }
    }

    void execute(Runnable runnable) throws InterruptedException {
        workQueue.put(runnable);
    }


    class WorkerThread extends Thread {

        @SneakyThrows
        public void run(){
            //循环任务并执行
            while (true){
                Runnable task = workQueue.take();
                task.run();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<>(2);
//        MyThreadPool pool = new MyThreadPool(10,workQueue);
//        pool.execute(()->{
//            System.out.println("Hello");
//        });
//        System.out.println("end");

        BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<>(2);

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,2,2, TimeUnit.SECONDS,workQueue);
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("execute");
            }
        });

        Future<?> submit = poolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("submit");
            }
        });

        Future<Object> submit_call = poolExecutor.submit(new Callable<Object>() {

            @Override
            public Object call() throws Exception {
                System.out.println("submit call");
                return "return submit call";
            }
        });

        System.out.println(submit_call.get());

        Future<String> submit1 = poolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("submit runnable");
            }
        }, "submit runnable result");
        System.out.println(submit1.get());
    }

}
