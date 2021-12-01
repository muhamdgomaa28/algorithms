package LinkedList;


import java.util.ArrayList;
import java.util.List;

class Node {

    public String val;
    public Node next;

    Node(String intitialVal) {
        val = intitialVal;
        next = null;
    }
}

public class linkedlistValues {
    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(linkedInValues(a));

    }


    static List linkedInValues(Node node) {
        List listValues = new ArrayList();

        fillValues(node, listValues);

        return listValues;
    }

    static void fillValues(Node node, List values) {
        if (node == null) return;
        values.add(node.val);

        fillValues(node.next, values);
    }

}
