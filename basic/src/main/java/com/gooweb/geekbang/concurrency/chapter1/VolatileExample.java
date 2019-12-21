package com.gooweb.geekbang.concurrency.chapter1;

/**
 * @author sunteng
 * @create 2019-07-18 下午 7:53
 **/
public class VolatileExample {
  int x =0;
  volatile boolean v = false;

  public void writer(){
      x = 42;
      v = true;
  }

  public void reader(){
      if(v == true){
          System.out.println("v == true");
          System.out.println("x == 42");
      }
  }

    /**
     * 1、“x=42" happen-before 写变量 ”v=true" ,这是规则1的内容
     * 2、写变量“v=42" hanppen-before 读变量 ”v=true" 这是规则2的内容
     * 3、根据规则3，所以x==42
     */
}
