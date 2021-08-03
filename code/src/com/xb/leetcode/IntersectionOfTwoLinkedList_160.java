package com.xb.leetcode;

/**
 *@ClassName IntersectionOfTwoLinkedList_160
 *@Description TODO
 *@Author xb
 *@Date 2021/6/29 15:34
 *@Version 1.0
 **/

public class IntersectionOfTwoLinkedList_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);

    }

}
