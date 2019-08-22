package com.gooweb.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 141. 环形链表
 * @author sunteng
 * @create 2019-08-22 下午 4:54
 **/
public class Solution_141 {

    //哈希表法
    public boolean hasCycle(ListNode head){
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null){
            if(nodeSet.contains(head)){
                return true;
            } else {
                nodeSet.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;



        Solution_141 solution_141 = new Solution_141();
        boolean b = solution_141.hasCycle(node1);
        System.out.println(b);
    }

}
