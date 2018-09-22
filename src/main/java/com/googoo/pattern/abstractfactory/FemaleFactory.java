package com.googoo.pattern.abstractfactory;

/**
 * @ClassName FemaleFactory
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:56
 * @Version 1.0
 **/
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();

    }
}
