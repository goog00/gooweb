package com.gooweb.jvm;

/**
 * @author steng
 * @description
 * @date 2020-01-11 10:08 上午
 **/
public class Test {
    public int inc(){
        int x;
        try{
            x = 1;
//            int i = 1 / 0;
            System.exit(0);
            return x;

        } catch (Exception e){
            x = 2;
            return x;
        } finally {
            x =3;
            return x;
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        int k = test.inc();
        System.out.println(k);
    }
}
