package com.googoo.pattern.abstractfactory;

/**
 * @ClassName HumanFactory
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:55
 * @Version 1.0
 **/
public interface HumanFactory {

    //制造一个黄色人种
     Human createYellowHuman();
    //制造一个白色人种
     Human createWhiteHuman();
    //制造一个黑色人种
     Human createBlackHuman();
}
