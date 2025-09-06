package org.example.lc;

public class Lc2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static void main(String[] args) {
        ListNode n11 = new ListNode(9);
        ListNode n10 = new ListNode(9, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(9, n9);
        ListNode n7 = new ListNode(9, n8);
        ListNode n6 = new ListNode(9, n7);
        ListNode n5 = new ListNode(9, n6);

        ListNode n4 = new ListNode(9);
        ListNode n3 = new ListNode(9, n4);
        ListNode n2 = new ListNode(9, n3);
        ListNode n1 = new ListNode(9, n2);

        ListNode listNode = addTwoNumbers(n1, n5);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode l1First = l1;
        ListNode l2First = l2;

        ListNode node = new ListNode();
        ListNode first = node;
        int plusOne = 0;
        while (l1First != null || l2First != null) {
            if (l1First == null) {
                int sum = l2First.val + plusOne;
                if (sum == 10) {
                    plusOne = 1;
                } else {
                    plusOne = 0;
                }
                node.next = new ListNode(sum % 10);
                node = node.next;
                l2First = l2First.next;
                continue;
            }
            if (l2First == null) {
                int sum = l1First.val + plusOne;
                if (sum == 10) {
                    plusOne = 1;
                } else {
                    plusOne = 0;
                }
                node.next = new ListNode(sum % 10);
                node = node.next;
                l1First = l1First.next;
                continue;
            }
            int sum = l1First.val + l2First.val + plusOne;
            if (sum >= 10) {
                plusOne = 1;
            } else {
                plusOne = 0;
            }
            node.next = new ListNode(sum % 10);
            node = node.next;
            l1First = l1First.next;
            l2First = l2First.next;
        }
        if (plusOne == 1) {
            node.next = new ListNode(1);
        }
        return first.next;
    }
}
