package com.googoo.pattern.build;

import java.util.ArrayList;

/**
 * client
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:57
 **/
public class BuilderClient {

    public static void main(String[] args) {
        ArrayList sequence = new ArrayList();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder builder = new BenzBuilder();

        builder.setSequence(sequence);
        CarModel carModel = builder.getCarModel();
        carModel.run();
    }
}
