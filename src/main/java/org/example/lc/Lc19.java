package org.example.lc;

import org.example.lc.model.ListNode;

import java.util.ArrayList;

public class Lc19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        if (list.size() == n) {
            return head.next;
        }
        ListNode listNode = list.get(list.size() - n - 1);
        if (listNode == null) {
            return null;
        }
        listNode.next = listNode.next.next;
        return head;
    }
}
