package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class FindByIndexLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int initialVal) {
            val = initialVal;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(3);
        Node d = new Node(-1);
        Node e = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(getNodeValue(b,0));
    }

    static String getNodeValue(Node node, int index) {
        List list = new ArrayList();
        while(node != null){
            list.add(node.val);
            node = node.next;

        }
        if(index > list.size() - 1) return null;
        return String.valueOf(list.get(index));

    }
}