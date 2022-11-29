class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class Dubly_LinkList {

    static Node insertBegin(Node head, int data) {// INsert Begning
        Node temp = new Node(data);
        temp.next = head;
        if (head != null)
            head.prev = temp;
        return temp;
    }

    public static void main(String[] args) {

        Node head = new Node(10);// Dubley LINK_LIST Insertion Begning
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printList(head);
        head = insertBegin(head, 5);
        printList(head);
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;

        }
        System.out.println();
    }
}
