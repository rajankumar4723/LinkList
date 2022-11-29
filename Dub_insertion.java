
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
    }
}

public class Dub_insertion {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        // printlist(head);
        head = insertionHaid(head, 85);
        printlist(head);
        
    }

    static Node insertionHaid(Node head, int d) {
        Node temp = new Node(d);
        temp.next = head;
        if (head != null)
            head.prev = temp;
        return temp;
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
