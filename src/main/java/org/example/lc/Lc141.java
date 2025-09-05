package org.example.lc;

public class Lc141 {
    public static void main(String[] args) {
//        ListNode n4 = new ListNode(4);
//        ListNode n3 = new ListNode(0, n4);
//        ListNode n2 = new ListNode(2, n3);
//        ListNode n1 = new ListNode(3, n2);
//        n4.next = n2;
        ListNode n5 = new ListNode(1);
        ListNode n4 = new ListNode(2, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        boolean b = hasCycle(n1);
        System.out.println(b);
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
