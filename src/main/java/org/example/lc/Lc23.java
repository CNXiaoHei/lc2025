package org.example.lc;

import org.example.lc.model.ListNode;

public class Lc23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode head = new ListNode();
        ListNode node1 = lists[0];
        head.next = node1;
        for (int i = 1; i < lists.length; i++) {
            ListNode node2 = lists[i];
            head.next = merge(node1, node2);
            node1 = head.next;
        }
        return head.next;
    }

    private ListNode merge(ListNode n1, ListNode n2) {
        ListNode head = new ListNode();
        ListNode node = head;
        while (n1 != null || n2 !=null) {
            if (n1 == null) {
                node.next = n2;
                break;
            }
            if (n2 == null) {
                node.next = n1;
                break;
            }
            if (n1.val <= n2.val) {
                node.next = n1;
                n1 = n1.next;
                node = node.next;
            } else {
                node.next = n2;
                n2 = n2.next;
                node = node.next;
            }
        }
        return head.next;
    }
}
