package com.gooweb.leetcode.array;

import com.gooweb.leetcode.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 160. 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 * @author sunteng
 * @create 2019-08-24 上午 9:51
 **/
public class Solution_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Map<String,ListNode> map = new HashMap();
        while(headA != null){
            map.put(headA.val + "",headA);
            headA = headA.next;
        }

        while(headB != null){
            if(map.containsKey(headB.val + "")){
                return map.get(headB.val + "");
            }
            headB = headB.next;
        }

        return null;

    }

    public static void main(String[] args) {




        ListNode headA = new ListNode(4);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(8);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        headA.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode4;
        listNode4.next = listNode5;


        ListNode headB = new ListNode(5);
        ListNode listNodeB1 = new ListNode(0);
        ListNode listNodeB2 = new ListNode(1);
        ListNode listNodeB4 = new ListNode(8);
        ListNode listNodeB5 = new ListNode(4);
        ListNode listNodeB6 = new ListNode(5);

        headB.next = listNodeB1;
        listNodeB1.next = listNodeB2;
        listNodeB2.next = listNodeB4;
        listNodeB4.next = listNodeB5;
        listNodeB5.next = listNodeB6;



        Solution_160 solution_160 = new Solution_160();
        ListNode intersectionNode = solution_160.getIntersectionNode(headA, headB);
        System.out.println("-----" + intersectionNode.val);


    }

}
