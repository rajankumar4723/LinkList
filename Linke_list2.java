public class Linke_list2 {
    
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
        }
        
    }
    
    public static void main(String[] args) {
        
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        print(head);


    }
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }

        

    }
}
