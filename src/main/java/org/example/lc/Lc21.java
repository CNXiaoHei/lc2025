package org.example.lc;

public class Lc21 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode n6 = new ListNode(4);
        ListNode n5 = new ListNode(3, n6);
        ListNode n4 = new ListNode(1, n5);

        ListNode n3 = new ListNode(4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        ListNode listNode = mergeTwoLists(n1, n4);
        System.out.println(listNode);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode first = list;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null || p2 != null) {
            if (p1 == null) {
                list.next = p2;
                break;
            }
            if (p2 == null) {
                list.next = p1;
                break;
            }
            ListNode p1Next = p1.next;
            ListNode p2Next = p2.next;
            if (p1.val <= p2.val) {
                list.next = p1;
                p1 = p1Next;
            } else {
                list.next = p2;
                p2 = p2Next;
            }
            list = list.next;
        }
        return first.next;
    }
}
