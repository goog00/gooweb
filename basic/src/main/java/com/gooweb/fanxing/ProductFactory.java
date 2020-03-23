package com.gooweb.fanxing;

/**
 * @author steng
 * @description
 * @date 2020-03-01 7:20 上午
 **/
public class ProductFactory implements Factory<Integer> {
    @Override
    public Integer create() {
        Integer integer = new Integer(10);
        System.out.println(integer);
        return integer;
    }

    public static void main(String[] args) {
        new Product(new ProductFactory());
    }
}
