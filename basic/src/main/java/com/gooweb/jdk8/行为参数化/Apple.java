package com.gooweb.jdk8.行为参数化;

import lombok.Data;

@Data
public class Apple {
    private String color;
    private double weight;

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    } // 省略getter/settter...

    @Override
    public String toString() {
        return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
    }
}