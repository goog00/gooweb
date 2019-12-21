package com.gooweb.leetcode.array;

import com.gooweb.leetcode.ListNode;

/**
 * @author steng
 * @description 反转链表
 * @date 2019-12-21 9:23 上午
 **/
public class Solution_206 {

    public static ListNode reverseList(ListNode head){

        //遍历链表时用来记录每次循环操作的结点
        ListNode curr = head;
        ListNode pre = null;
        while (curr != null){
            //使用第三个变量保存当前结点的下一个结点，否则下一个结点会丢失
            ListNode third = curr.next;
            //反转结点，使当前结点的指针指向前面的结点
            curr.next = pre;
            //当前结点指向前一个结点
            pre = curr;
            //把暂存的当前结点的下一个结点，指向当前结点
            curr = third;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode listNode = reverseList(n1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


}

