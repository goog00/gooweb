package com.googoo.pattern.build;

import java.util.ArrayList;

/**
 * carbuilder
 *
 * @author sunteng
 * @create 2018-10-14 下午 10:00
 **/
public abstract class CarBuilder {

    //建造一个模型，你要给我一个顺序要求，
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
