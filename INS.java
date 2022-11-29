class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

public class INS {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        // printlist(head);
        head = insertionHead(head, 5);
        head = insertionTail(head, 85);
        printlist(head);

    }

    static Node insertionHead(Node head, int d) {
        Node temp = new Node(d);
        temp.next = head;
        // head=temp.next;
        return temp;
    }

    static Node insertionTail(Node head, int d) {
        Node temp = new Node(d);
        if (head == null)
            return temp;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;

        }
        curr.next = temp;
        return head;

    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;

        }
    }
}
