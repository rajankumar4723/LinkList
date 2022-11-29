class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class SortedInsert_circlar {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printlist(head);
        System.out.println("After insert");
        insert(head, 45);
        printlist(head);
    }

    static Node insert(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return null;
        if (x < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
            temp.next = curr.next;
            curr.next = temp;

        }
        return head;
    }

    static void printlist(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + "-->");
            r = r.next;
        } while (r != head);
        System.out.println();
    }
}
