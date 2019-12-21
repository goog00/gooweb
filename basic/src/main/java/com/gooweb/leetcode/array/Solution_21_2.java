package com.gooweb.leetcode.array;

import com.gooweb.leetcode.ListNode;

/**
 * @author steng
 * @description 合并两个有序链表
 * @date 2019-12-21 10:46 上午
 **/
public class Solution_21_2 {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        //哨兵结点
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if(l1 == null){
            prev.next = l2;
        } else {
            prev.next = l1;
        }

        return prehead.next;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;

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
