class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class Insertion_Circular_beg {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printlist(head);
        System.out.println("After insert Node");
        head = insertBeg(head, 15);
        printlist(head);

    }

    static void printlist(Node head) {
        if (head == null)
            return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
        System.out.println();
    }

    static Node insertBeg(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            temp.next = temp;
        else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }

        return temp;

    }

}
