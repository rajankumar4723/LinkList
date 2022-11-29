class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class Midle_of_Link {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
       // head.next.next.next.next.next=head;
        printlist(head);
        System.out.println("Position print Midle");
        printmidle(head);
        printlist(head);
    }
static void printmidle(Node head){
    if(head==null)return;
    Node slow=head,fast=head;
    while(fast!=null&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    System.out.println(slow.data);
}

    static void printlist(Node head){
        Node curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
            
        }
        System.out.println();
    }

}
