package LinkedList3;

//import LinkedList2.Node;

public class MergeTwoSortedLL {
    static Node mergeTwoSortedLL(Node head1, Node head2){
        Node head = null, tail = null;
        Node a = head1, b = head2;

        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data){
            head = a;
            tail = a;
            a = a.next;

        }else{
            head = b;
            tail = b;
            b = b.next;
        }
        while(a != null && b != null){
            if (a.data<= b.data){
                tail.next = a;
                tail = a;
                a= a.next;
            }else{
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a == null) tail.next = b;
        if (b == null) tail.next = a;
        return head;

     }

    public static void main(String[] args) {


    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }

}