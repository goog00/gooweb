package com.gooweb.pattern.composite;

/**
 * @author sunteng
 * @date 2019-11-26 上午 8:49
 **/
public class Client {

    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();

        //创建一个树枝节点
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立成体
        root.add(branch);
        branch.add(leaf);

    }

    public static void display(Composite root){
        for(Component c : root.getChildren()){
            if(c instanceof  Leaf){
                c.doSomething();
            } else {
                display((Composite) c);
            }
        }

    }
}
