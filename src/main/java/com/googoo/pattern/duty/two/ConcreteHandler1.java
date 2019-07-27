package com.googoo.pattern.duty.two;

import java.util.logging.Level;

/**
 * @author sunteng
 * @create 2019-07-27 上午 10:54
 **/
public class ConcreteHandler1 extends Handler{

    /**
     * 设置自己的处理级别
     * @return
     */
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    //定义自己的处理逻辑
    @Override
    protected Response echo(Request request) {
        return null;
    }
}
