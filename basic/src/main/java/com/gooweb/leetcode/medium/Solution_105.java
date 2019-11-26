package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.TreeNode;

import java.util.HashMap;

/**
 * 从前序与中序遍历序列构造二叉树
 *
 * @author sunteng
 * @create 2019-09-01 上午 11:28
 **/
public class Solution_105 {

    //start from first preorder element
    int pre_idx = 0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer,Integer> idx_map = new HashMap<>();


    public TreeNode helper(int in_left,int in_right){

        if(in_left == in_right){
            return null;
        }

        int root_val =  preorder[pre_idx];
        TreeNode root = new TreeNode(root_val);

        //root splits inorder list
        //into left and right subtreess
        int index = idx_map.get(root_val);

        //recursion
        pre_idx++;

        //build left subtree;
        root.left = helper(in_left,index);
        //build right subtree
        root.right = helper(index + 1,in_right);
        return root;

    }

    public TreeNode buildTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        this.inorder = inorder;

        //build a hashmap value ->its index
        int idx = 0;
        for(Integer val : inorder){
            idx_map.put(val,idx++);
        }
        return helper(0,inorder.length);
    }

    public static void main(String[] args) {

    }
}
