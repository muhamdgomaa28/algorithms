package LinkedList;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ZipperLists {
    static class Node {
        String val;
        Node next;

        Node(String initialVal) {
            val = initialVal;
            next = null;
        }
    }


    public static void main(String[] args) {



        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        a.next = b;
        b.next = c;
// a -> b -> c

        Node x = new Node("x");
        Node y = new Node("y");
        Node z = new Node("z");
        x.next = y;
        y.next = z;
//        zipperLists(a, x).forEach(node ->{
//            System.out.println(node);
//        } );

//        System.out.println(zipperLists(a,x).next.val);

    }


    static Node zipperLists(Node head1, Node head2){
        if(head1 == null && head2 == null) return null;
        if(head1 == null) return head2;
        if(head2 == null) return  head1;

// a  b  c
// x  y  z
        Node next1 = head1.next;

        Node next2 = head2.next;


        head1.next = head2;
        head2.next = zipperLists(next1, next2);
        return head1;


    }
}
