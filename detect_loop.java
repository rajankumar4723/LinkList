import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;

    }
}

public class detect_loop {
    public static void main(String[] args) {// Circular
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(5);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
        //printlist(head);
        if (isLoop(head))
            System.out.print("Loop Found");
        else
            System.out.println("Not found");
    }

    static boolean isLoop(Node head) {
        HashSet<Node> s = new HashSet<Node>();
        for (Node curr = head; curr != null; curr = curr.next) {
            if (s.contains(curr)) {
                return true;
            }
            s.add(curr);

        }
        return false;
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
