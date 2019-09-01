package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102 二叉树遍历
 * 迭代
 * @author sunteng
 * @create 2019-09-01 上午 9:43
 **/
public class Solution_102_2 {

    /**
     * 复杂度分析
     *
     * 时间复杂度：O(N)O(N)，因为每个节点恰好会被运算一次。
     * 空间复杂度：O(N)O(N)，保存输出结果的数组包含 N 个节点的值。
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> levels = new ArrayList<>();
        if(root == null){
            return levels;
        }
       //队列先进先出:每次把
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        while(!queue.isEmpty()){

            //为当前层初始化一个空列表
            levels.add(new ArrayList<>());
            int level_length = queue.size();

            for(int i = 0; i < level_length; ++i){
                //从队列中取出当前层的节点
                TreeNode node = queue.remove();
                //把节点放入当前层的list中
                levels.get(level).add(node.val);

                if(node.left != null){
                    //当前节点的孩子节点作为下一层压入到队列中
                    queue.add(node.left);
                }
                if(node.right != null){
                    //当前节点的孩子节点作为下一层压入到队列中
                    queue.add(node.right);
                }

            }
            //层加1
            level++;
        }
        return levels;

    }

    public static void main(String[] args) {
        Solution_102_2 solution_102 = new Solution_102_2();

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
