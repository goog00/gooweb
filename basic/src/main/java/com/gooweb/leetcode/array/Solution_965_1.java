package com.gooweb.leetcode.array;

import com.gooweb.leetcode.TreeNode;

/**
 * @author sunteng
 * @create 2019-09-19 下午 1:48
 **/
public class Solution_965_1 {

    public boolean isUnivalTree(TreeNode r){
        return dfs(r,r.val);
    }

    private boolean dfs(TreeNode r,int v){
        return r == null || (r.val == v && dfs(r.left,v) && dfs(r.right,v));
    }
    public static void main(String[] args) {
        Solution_965_1 solution_965 = new Solution_965_1();
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode2.left = treeNode4;

        boolean univalTree = solution_965.isUnivalTree(treeNode);
        System.out.println(univalTree);

    }

}
