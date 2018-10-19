package com.googoo.pattern.build;

import java.util.ArrayList;

/**
 * client
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:57
 **/
public class Client {

    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        ArrayList sequence = new ArrayList();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");

        benzModel.setSequence(sequence);
        benzModel.run();
    }
}
