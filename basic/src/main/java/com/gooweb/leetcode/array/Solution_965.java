package com.gooweb.leetcode.array;

import com.gooweb.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 单值二叉树
 *
 * @author sunteng
 * @create 2019-09-19 下午 1:27
 **/
public class Solution_965 {

    Set<Integer> vals;

    public boolean isUnivalTree(TreeNode root){
        vals = new HashSet<>();
        dfs(root);
        if(vals.size() > 1){
            return false;
        }
        return true;
    }

    //深度优先遍历--》前序遍历
    private void dfs(TreeNode node){
        if(node != null){
            vals.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution_965 solution_965 = new Solution_965();
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
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
