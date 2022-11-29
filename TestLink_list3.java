public class insert {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
        }
    }
    
   // static class Test{

        static Node insertBegin(Node head, int x){
            Node temp=new Node(56);
            temp.next=head;
            return temp;
        }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Node head=null;
        head=insertBegin(head, 30);
        head=insertBegin(head, 20);
        head=insertBegin(head, 10);
        head=insertBegin(head, 40);
        print(head);
        insertBegin(head, 45);
        

    }
    static void print(Node head){
        Node curr=head;
        while (curr!=null) {
            System.out.println(curr.data+" ");
            curr=curr.next;
            
        }
    }
}
}

