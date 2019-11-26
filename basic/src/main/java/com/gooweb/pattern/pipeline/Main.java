package com.gooweb.pattern.pipeline;

/**
 * 测试类
 *
 * @author sunteng
 * @date 2019-11-26 下午 11:08
 **/
public class Main {

    public static void main(String[] args) {
        String handling = "aabb1122zzyy";
        StandardPipeline pipeline = new StandardPipeline();
        BasicValve basicValve = new BasicValve();
        SecondValve secondValve = new SecondValve();
        ThirdValve thirdValve = new ThirdValve();

        pipeline.setBasic(basicValve);
        pipeline.addValve(secondValve);
        pipeline.addValve(thirdValve);
        pipeline.getFirst().invoke(handling);
    }
}
