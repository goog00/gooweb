package com.gooweb.leetcode.array;

import com.gooweb.leetcode.GetTree;
import com.gooweb.leetcode.TreeNode;

/**
 * 226 翻转二叉树
 * @author sunteng
 * @create 2019-09-19 下午 2:07
 **/
public class Solution_226 {

    public TreeNode invertTree(TreeNode root){

        if(root == null){
            return null;
        }
//        TreeNode treeNode = root;
//        treeNode.left = root.right;
//        treeNode.right = root.left;
        final TreeNode left = root.left,
                  right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);

        return root;
    }

    private static void dfs(TreeNode root){
        if(root != null){
            System.out.print(root.val + ",");
            dfs(root.left);
            dfs(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = GetTree.getTreeNode();
        dfs(treeNode);

        Solution_226 solution_226 = new Solution_226();
        TreeNode treeNode1 = solution_226.invertTree(treeNode);
        System.out.println();
        System.out.println("翻转后");
        dfs(treeNode1);
    }


}
