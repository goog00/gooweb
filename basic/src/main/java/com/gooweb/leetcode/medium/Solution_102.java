package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的层次遍历
 * 递归
 * @author sunteng
 * @create 2019-09-01 上午 9:03
 **/
public class Solution_102 {
    /**
     * 复杂度分析
     *
     * 时间复杂度：O(N)O(N)，因为每个节点恰好会被运算一次。
     * 空间复杂度：O(N)O(N)，保存输出结果的数组包含 N 个节点的值。
     */

    List<List<Integer>> levels = new ArrayList<>();

    public void helper(TreeNode node,int level){

        if(levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }

        //存储节点值
        levels.get(level).add(node.val);

        //
        if(node.left != null){
            helper(node.left,level + 1);
        }

        if(node.right != null){
            helper(node.right,level + 1);
        }

    }

    public List<List<Integer>> levelOrder(TreeNode root){
        if(root == null){
            return levels;
        }
        helper(root,0);
        return levels;
    }


    public static void main(String[] args) {
        Solution_102 solution_102 = new Solution_102();

        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);


        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        List<List<Integer>> lists = solution_102.levelOrder(treeNode);
        for(List<Integer> kk : lists){
            System.out.println("");
            for(Integer integer : kk){
                System.out.print(integer + "  ");
            }

        }



    }


}
