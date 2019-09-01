package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94 二叉树中序遍历 基于栈的遍历
 * @author sunteng
 * @create 2019-09-01 上午 10:23
 **/
public class Solution_94_2 {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        //后进先出
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()){
            while (curr != null){
                //
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }

        return res;

    }

    public static void main(String[] args) {
        Solution_94_2 solution_94_2 = new Solution_94_2();

        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
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

        List<Integer> list = solution_94_2.inorderTraversal(treeNode);

        for(Integer integer : list){
            System.out.println(integer);
        }
    }
}
