package com.gooweb.leetcode.array;

import com.gooweb.leetcode.TreeNode;

/**
 * 543 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 * @author sunteng
 * @create 2019-08-23 上午 7:52
 **/
public class Solution_543 {

    //记录最大直径
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root){

        depth(root);
        return max;
    }

    private int depth(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        //max记录当前的最大直径
        max = Math.max(leftDepth + rightDepth,max);

        return Math.max(leftDepth,rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);

        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode3.left = treeNode4;

        Solution_543 solution_543 = new Solution_543();
        int depth = solution_543.depth(treeNode1);
        System.out.println(depth);

    }

}
