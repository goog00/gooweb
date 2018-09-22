package com.googoo.pattern.abstractfactory;

/**
 * @ClassName MaleFactory
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 21:02
 * @Version 1.0
 **/
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
