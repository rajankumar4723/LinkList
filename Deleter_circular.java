
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class Deleter_circular {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printlist(head);
        System.out.println("After Delete");
        head = delHeadNode(head);
        printlist(head);
    }

    static Node delHeadNode(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
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

}
