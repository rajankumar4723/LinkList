class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

/**
 * Search_Node
 */
public class Search_Node {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        System.out.println("Postion find  " + Search(head, 30));// Searching in Linklist Node

    }

    // static int Search(Node head, int x) {//Itrative Soluation
    // int pos = 1;
    // Node curr = head;
    // while (curr != null) {// Condition check than print searching Node
    // if (curr.data == x) {
    // return pos;
    // } else {
    // pos++;
    // curr = curr.next;

    // }
    // }
    static int Search(Node head, int x){//Recusive Sulation
        if(head==null)return -1;
        if(head.data==x)return 1;
        else{
            int res=Search(head.next,x);
            if(res==-1)return -1;
            else return res+1;
        }
    //}return-1;

    }

    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + "-->");
            curr = curr.next;

        }

    }

}