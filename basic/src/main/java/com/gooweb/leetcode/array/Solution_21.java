package com.gooweb.leetcode.array;

import com.gooweb.leetcode.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 合并两个有序链表
 * @author sunteng
 * @create 2019-08-20 下午 9:10
 **/
public class Solution_21 {

    /**
     * 1.链表是有序的
     * 2.递归
     * @param l1
     * @param l2
     * @return
     */

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        node1.next = node2;
//        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(20);
        node4.next = node5;
        node5.next = node6;

        ListNode node = mergeTwoLists(node1, node4);
        ListNode tmp  = node;
        while (tmp != null){
            System.out.println(tmp.val);
            tmp = tmp.next;

        }

    }



}


