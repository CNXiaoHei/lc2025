package org.example.lc;

import java.util.HashMap;

public class Lc160 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        while (headA != null) {
            hashMap.put(headA, 1);
            headA = headA.next;
        }

        while (headB != null) {
            if (hashMap.containsKey(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

