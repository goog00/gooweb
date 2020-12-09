package com.gooweb.datastruct;

import com.gooweb.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode removeDuplicateNodes(ListNode head) {

        if(head == null){
            return head;
        }
        Set<Integer> occurred = new HashSet<>();
        occurred.add(head.val);
        ListNode pos = head;

        while (pos.next != null){
            //当前待删除节点
            ListNode cur = pos.next;
            if(occurred.add(cur.val)){
                pos = pos.next;
            } else {
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.getListNode();
        Solution.removeDuplicateNodes(listNode);
    }
}