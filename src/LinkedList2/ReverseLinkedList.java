package LinkedList2;

public class ReverseLinkedList {
    static Node reverseLL(Node head) {
        Node cur = head, prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    private static void printLL(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        printLL(head);
        Node newHead = reverseLL(head);
        printLL(head);


    }
}


//class Node{
//    int data;
//    Node next;
//    public Node(int data){
//        this.data = data;
//    }
//}