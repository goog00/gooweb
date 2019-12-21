package com.gooweb.leetcode.array;

import com.gooweb.leetcode.ListNode;

/**
 * 快慢指针
 * @author steng
 * @description 环形链表
 * @date 2019-12-21 10:21 上午
 **/
public class Solution_141_2 {
    public boolean hasCycle(ListNode head){

        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node2;
        Solution_141_2 solution_141 = new Solution_141_2();
        boolean b = solution_141.hasCycle(node1);
        System.out.println(b);
    }
}
