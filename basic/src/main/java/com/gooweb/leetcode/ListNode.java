package com.gooweb.leetcode;

public class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int x){
        val = x;
    }


    public static ListNode getListNode(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        ListNode two1 = new ListNode(2);
        ListNode one1 = new ListNode(1);
        one.next = two;
        two.next = two1;
        two1.next = one1;
        return one;
    }



}