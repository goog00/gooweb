package com.gooweb.leetcode.array;

import com.gooweb.leetcode.GetTree;
import com.gooweb.leetcode.TreeNode;

import java.util.HashSet;
import java.util.Stack;

/**
 * 606 根据二叉树构建字符串
 * https://leetcode-cn.com/problems/construct-string-from-binary-tree/solution/
 *
 * @author sunteng
 * @create 2019-09-19 下午 3:50
 **/
public class Solution_606 {


    public String tree2str(TreeNode root) {

        if(root == null){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        HashSet<TreeNode> visited  = new HashSet<>();

        while (!stack.empty()) {
            //look at the object at top of this stack without removing it from the stack
            TreeNode t = stack.peek();

            if (visited.contains(t)) {
                //removes the object at the top of this stack and return that objects as the value of this function
                stack.pop();
                sb.append(')');

            } else {
                visited.add(t);
                sb.append('(').append(t.val);

                if (t.left == null && t.right != null) {
                    sb.append("()");
                }
                if (t.right != null) {
                    stack.push(t.right);
                }
                if (t.left != null) {
                    stack.push(t.left);
                }
            }

        }
        return sb.toString().substring(1, sb.toString().length() - 1);
    }

    public static void main(String[] args) {
        Solution_606 solution_606 = new Solution_606();
//        TreeNode treeNode = GetTree.getTreeNode();
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;

        String s = solution_606.tree2str(treeNode);
        System.out.println(s);
    }

}
