package com.googoo.pattern.advanced;

/**
 * 驾驶员实现
 *
 * @author sunteng
 * @create 2018-09-07 上午 11:05
 **/
public class Driver implements IDriver {
    public void drive(ICar car) {
        car.run();
    }
}
