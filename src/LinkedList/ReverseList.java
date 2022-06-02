package LinkedList;


public class ReverseList {
    static class Node {
        int val;
        Node next;

        Node(int initialVal) {
            val = initialVal;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(reverseList(a).val);

    }
    // a --> b ---> c --> d
    static Node reverseList(Node head){
        Node current = head;
        Node prev = null;

        while (current != null){
            Node next = current.next;
            current.next =  prev;
            prev = current;
            current = next;

        }

        return prev;


    }
}