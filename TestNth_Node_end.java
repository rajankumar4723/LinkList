import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class TestNth_Node_end {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printlist(head);
        System.out.println("Nth node from end of Linked List: ");
        printNthFromEnd(head, 1);
        printlist(head);

    }

    static void printNthFromEnd(Node head, int n) {//Starting insertion
        int len = 0;
        for (Node curr = head; curr != null; curr = curr.next)
            len++;
        if (len < n)
            return;
        Node curr = head;
        for (int i = 1; i < len - n + 1; i++)
            curr = curr.next;
        System.out.print(curr.data+" ");
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}