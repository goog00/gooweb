package com.gooweb.leetcode.array;

import com.gooweb.leetcode.ListNode;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * @author steng
 * @description 回文链
 * @date 2019-12-18 10:19 下午
 **/
public class Solution_234 {

    public static boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head,fast = head;
        ListNode pre = head,preNext = null;
        while (fast != null && fast.next != null){

            pre = slow;
            slow = slow.next;
            fast = fast.next.next;

            pre.next = preNext;
            preNext = pre;
        }

        if(fast != null){
            slow = slow.next;
        }
        while (pre != null && slow != null){
            if(pre.val != slow.val){
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {

        ListNode listNode = ListNode.getListNode();

        boolean palindrome = isPalindrome(listNode);
        System.out.println(palindrome);

    }

}
