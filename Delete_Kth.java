class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class Delete_Kth {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printlist(head);
        System.out.println("after");
        head = deleteKth(head, 3);
        printlist(head);
    }

    static Node deleteKth(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1)
            return delhead(head);
        Node curr = head;
        for (int i = 0; i < k - 2; i++)
            curr = curr.next;
        curr.next = curr.next.next;
        return head;

    }

    static Node delhead(Node head) {
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
