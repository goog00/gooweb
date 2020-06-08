package com.gooweb.pattern.factory;

/**
 * @author steng
 * @description
 * @date 2020-03-23 9:46 上午
 **/
public class FactoryA extends Factory<Product> {
    @Override
    public Product createProduct(Class<Product> clzz) throws Exception {

        return (Product) Class.forName(clzz.getName()).newInstance();
    }
}
