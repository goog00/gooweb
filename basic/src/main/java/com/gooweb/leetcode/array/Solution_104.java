package com.gooweb.leetcode.array;

import com.gooweb.leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 104 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数
 *
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * @author sunteng
 * @create 2019-08-24 上午 9:27
 **/
public class Solution_104 {

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right) + 1;
        }

    }

    public static void main(String[] args) {
        Solution_104 solution_104 = new Solution_104();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode3.left = treeNode4;

        int i = solution_104.maxDepth(treeNode1);
        System.out.println(i);

        Map map = new HashMap<>();

    }
}
