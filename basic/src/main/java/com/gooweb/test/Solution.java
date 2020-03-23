package com.gooweb.test;

import com.gooweb.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode reverseList(ListNode head) {
        //一个新节点，用来存储翻转后的结点
        ListNode newNode = null;

        //当前结点
        ListNode curr = head;

        while (curr != null){
            //保存当前结点的next,因为要反转，不能丢失curr原来的next 结点，curr.next的结点相当于循环的标志
           ListNode tmp = curr.next;
           curr.next = newNode;
           newNode = curr;
           curr = tmp;
        }
        return newNode;
        
    }

    public static void main(String[] args) {

        ListNode head = ListNode.getListNode();

        ListNode listNode = reverseList(head);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }
}