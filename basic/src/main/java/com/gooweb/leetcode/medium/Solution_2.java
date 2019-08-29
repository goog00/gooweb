package com.gooweb.leetcode.medium;

import com.gooweb.leetcode.ListNode;

/**
 *2. 俩数相加
 * @author sunteng
 * @create 2019-08-29 上午 7:40
 **/
public class Solution_2 {

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);//初始化和的首节点
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum = carry + x + y;//进位与节点数字相加
            //取商：进位
            carry = sum / 10;
            //取余
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }

        }
        if(carry >0 ){//如果进位大于0，则添加一个新节点
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(8);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3= new ListNode(6);
        listNode.next = listNode2;
        listNode2.next = listNode3;


        ListNode node = new ListNode(5);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(7);
        node.next = node2;
        node2.next = node3;

        ListNode listNode1 = addTwoNumbers(listNode, node);

        System.out.println(listNode1);



    }
}
