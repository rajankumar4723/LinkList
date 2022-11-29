class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

public class Example_Nth_Node_Inser {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
        head = inertionPostion(head, 3, 45);
        printlist(head);
    }

    static Node inertionPostion(Node head, int postion, int d) {
        Node temp = new Node(d);
        if (postion == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= postion - 2 && curr != null; i++)
            curr = curr.next;
        if (curr == null)
            return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;

    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;

        }
        System.out.println();
    }

}
