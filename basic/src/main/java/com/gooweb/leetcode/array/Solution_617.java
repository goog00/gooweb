package com.gooweb.leetcode.array;

import com.gooweb.leetcode.TreeNode;

/**
 * @author sunteng
 * @create 2019-08-26 上午 8:57
 **/
public class Solution_617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){

       if(t1 == null){
           return t2;
       }
       if(t2 == null){
           return t1;
       }

       TreeNode treeNode = new TreeNode(t1.val + t2.val);
       treeNode.left = mergeTrees(t1.left,t2.left);
       treeNode.right = mergeTrees(t1.right,t2.right);
       return treeNode;

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;


        TreeNode treeNode6 = new TreeNode(1);
        TreeNode treeNode21 = new TreeNode(2);
        TreeNode treeNode32 = new TreeNode(3);
        TreeNode treeNode43 = new TreeNode(4);
        TreeNode treeNode54= new TreeNode(5);

    }


}
