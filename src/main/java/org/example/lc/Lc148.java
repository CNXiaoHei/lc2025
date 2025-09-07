package org.example.lc;

import org.example.lc.model.ListNode;

import java.util.PriorityQueue;

public class Lc148 {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((n1,n2) -> n1.val - n2.val);
        ListNode node = head;
        while (node != null) {
            priorityQueue.add(node);
            node = node.next;
        }
        ListNode n1 = new ListNode();
        node = n1;
        while (!priorityQueue.isEmpty()) {
            node.next = priorityQueue.poll();
            node = node.next;
        }
        node.next = null;
        return n1.next;
    }
}
