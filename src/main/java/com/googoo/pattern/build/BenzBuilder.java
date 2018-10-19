package com.googoo.pattern.build;

import java.util.ArrayList;

/**
 * 2
 *
 * @author sunteng
 * @create 2018-10-14 下午 10:03
 **/
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}
