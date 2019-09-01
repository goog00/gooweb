package com.gooweb.leetcode;

public  class GetTree {
    public static TreeNode getTreeNode() {
        TreeNode treeNode = new TreeNode(3);

        TreeNode treeNode1 = new TreeNode(66);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);

        TreeNode treeNode5 = new TreeNode(8);
        TreeNode treeNode6 = new TreeNode(9);
        TreeNode treeNode7 = new TreeNode(10);


        treeNode.left = treeNode1;
        treeNode1.left = treeNode5;
        treeNode5.left = treeNode6;
        treeNode6.right = treeNode7;


        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        return treeNode;
    }
}