package com.gooweb.leetcode.array;

import com.gooweb.leetcode.ListNode;

/**
 * @author steng
 * @description 链表的中间结点
 * @date 2019-12-21 1:24 下午
 **/
public class Solution_876 {

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        //使用快慢指针，快指针是慢指针的2倍，当快指针走到链表尾部，慢指针正好走到中间位置，返回慢指针指向结点
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        middleNode(node1);
        ListNode tmp  = middleNode(node1);;
        System.out.println(tmp.val);
    }

}
