package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.GetTree;
import com.gooweb.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树前序遍历
 *
 * @author sunteng
 * @create 2019-09-18 上午 7:27
 **/
public class Solution_144 {

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return new ArrayList<>(0);
        }

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        /**
         * 前序遍历 ： 根节点，左子树，右子树
         */
        while (!stack.isEmpty()){
             TreeNode n = stack.pop();
             list.add(n.val);

             if(n.right != null){
                 stack.push(n.right);
             }
             if(n.left != null){
                 stack.push(n.left);
             }
        }
        return  list;


    }

    public static void main(String[] args) {
        Solution_144 solution_144 = new Solution_144();

        TreeNode treeNode = GetTree.getTreeNode();

        List<Integer> list = solution_144.preorderTraversal(treeNode);

        for(Integer integer : list){
            System.out.println(integer);
        }

    }
}
