package org.example.lc;

public class Lc234 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(1);
        ListNode n4 = new ListNode(2, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        boolean isPal = isPalindrome(n1);
        System.out.println(isPal);
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode firstHalfLast = findNode(head);

        ListNode secondFirstNode = reverseListNode(firstHalfLast.next);

        ListNode p1 = head;
        ListNode p2 = secondFirstNode;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return result;
    }

    private static ListNode reverseListNode(ListNode listNode) {
        ListNode prev = null;
        ListNode curr = listNode;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static ListNode findNode(ListNode listNode) {
        ListNode fast = listNode;
        ListNode slow = listNode;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
