package com.googoo.pattern.build;

import java.util.ArrayList;

/**
 * 1
 *
 * @author sunteng
 * @create 2018-10-14 下午 10:05
 **/
public class BmwBuilder extends CarBuilder {

    BmwModel bmwModel = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
