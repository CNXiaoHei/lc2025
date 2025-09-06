package org.example.lc;

import org.example.lc.model.ListNode;

public class Lc25 {
    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode listNode = reverseKGroup(n1, 5);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        int count = 0;
        while (node != null && count < k) {
            node = node.next;
            count++;
        }
        if (node == null && count < k) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        count = 0;
        while (count < k) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = reverseKGroup(curr, k);
        return prev;
    }
}
