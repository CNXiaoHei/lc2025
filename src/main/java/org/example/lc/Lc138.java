package org.example.lc;

import org.example.lc.model.Node;

import java.util.HashMap;

public class Lc138 {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map1 = new HashMap<>();
        HashMap<Node, Node> map2 = new HashMap<>();

        Node n1 = new Node(0);
        Node prev = n1;
        Node node = head;
        while (node != null) {
            Node curr = new Node(node.val);
            prev.next = curr;
            prev = curr;
            map1.put(node, node.random);
            map2.put(node, curr);
            node = node.next;
        }
        node = head;
        while (node != null) {
            Node curr = map2.get(node);
            curr.random = map2.get(map1.get(node));
            node = node.next;
        }
        return n1.next;
    }
}
