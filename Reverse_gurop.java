//import java.util.HexFormat;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;

    }
}

public class Reverse_gurop {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        printlist(head);
        head=ReverseGurop(head, 3);
        printlist(head);
    }

    static Node ReverseGurop(Node head, int k) {
        Node curr=head,next=null,prev=null;
        int count=0;
        while(curr!=null&&count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node rest_head=ReverseGurop(next,k);
            head.next=rest_head;
        }
        return prev;
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
