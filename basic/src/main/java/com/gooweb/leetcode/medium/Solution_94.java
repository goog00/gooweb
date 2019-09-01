package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 94. 二叉树的中序遍历
 *  from https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/er-cha-shu-de-zhong-xu-bian-li-by-leetcode/
 * @author sunteng
 * @create 2019-09-01 上午 10:09
 **/
public class Solution_94 {

    /**
     * 复杂度分析
     *
     * 时间复杂度：O(n)O(n)。递归函数 T(n) = 2 \cdot T(n/2)+1T(n)=2⋅T(n/2)+1。
     * 空间复杂度：最坏情况下需要空间O(n)O(n)，平均情况为O(\log n)O(logn)。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/er-cha-shu-de-zhong-xu-bian-li-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param root
     * @return
     */

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;

    }

    public void helper(TreeNode root,List<Integer> res){
        if(root != null){
            if(root.left != null){
                helper(root.left,res);
            }
            res.add(root.val);
            if(root.right != null){
                helper(root.right,res);
            }
        }
    }


    public static void main(String[] args) {
        Solution_94 solution_94 = new Solution_94();
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);


        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        List<Integer> list = solution_94.inorderTraversal(treeNode);

        for(Integer integer : list){
            System.out.println(integer);
        }

    }
}
