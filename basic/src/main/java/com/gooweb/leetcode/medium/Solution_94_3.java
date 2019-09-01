package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.GetTree;
import com.gooweb.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94 二叉树的中序遍历
 * 莫里斯遍历
 *
 * @author sunteng
 * @create 2019-09-01 上午 10:51
 **/
public class Solution_94_3 {

    public List< Integer > inorderTraversal(TreeNode root){

        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        TreeNode pre;

        while (curr != null){
            if(curr.left == null){
                res.add(curr.val);
                //move to next right node
                curr = curr.right;
            } else {
                pre = curr.left;
                while (pre.right != null){
                    //find right most
                    pre = pre.right;
                }
                //put curr after the pre node
                pre.right = curr;
                //store cur node
                TreeNode temp = curr;
                //move cur to the top of the new tree
                curr = curr.left;
                // original cur left be null,avoid infinite loops;
                temp.left = null;
            }

        }
        return res;

    }

    public static void main(String[] args) {
        Solution_94_3 solution_94_3 = new Solution_94_3();

        TreeNode treeNode = GetTree.getTreeNode();

        List<Integer> list = solution_94_3.inorderTraversal(treeNode);

        for(Integer integer : list){
            System.out.println(integer);
        }
    }


}
