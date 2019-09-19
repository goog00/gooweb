package com.gooweb.leetcode;

import java.util.Objects;

/**
 * @author sunteng
 * @create 2019-08-23 上午 7:55
 **/
public class TreeNode {
    public int val ;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
