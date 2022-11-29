class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

public class Tail {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        // head.next.next=head;
        printlist(head);
        head = TailInse(head, 7);
        printlist(head);

    }

    static Node TailInse(Node head, int d) {
        Node temp = new Node(d);
        head.next = temp;
        head = temp;
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
