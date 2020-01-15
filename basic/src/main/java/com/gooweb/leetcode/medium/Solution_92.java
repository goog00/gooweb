package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.ListNode;

/**
 * @author steng
 * @description 反转链表II
 * @date 2019-12-19 1:26 下午
 **/
public class Solution_92 {

    public static ListNode reverseBetween(ListNode head, int m, int n) {
       if(head == null){
           return null;
       }

       ListNode cur = head,prev = null;
       while (m > 1){
           prev = cur;
           cur = cur.next;
           m--;
           n--;
       }

       ListNode con = prev;
       ListNode tail = cur;

       ListNode third = null;
       while (n > 0){
           third = cur.next;
           cur.next = prev;
           prev = cur;
           cur = third;
           n--;
       }

       if(con != null){
           con.next = prev;
       } else {
           head = prev;
       }

       tail.next = cur;
       return head;


    }

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode listNode = reverseBetween(one, 2, 4);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;

        }
    }

}
