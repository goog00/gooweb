package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.GetTree;
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

        TreeNode treeNode = GetTree.getTreeNode();

        List<Integer> list = solution_94_2.inorderTraversal(treeNode);

        for(Integer integer : list){
            System.out.println(integer);
        }
    }
}
