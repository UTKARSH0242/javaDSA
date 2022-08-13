package LinkedList;

public class TraverseInLinkedList {
   static void printLL(Node<Integer> head){
        Node<Integer> cur = head;
        while (cur != null){
            System.out.print(cur.data+ "->");
            cur = cur.next;
        }
        System.out.println(" end ");
    }
    public static void main(String[] args) {

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        Node<Integer> n6 = new Node<>(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printLL(n1);





    }
}
class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;

    }
}
