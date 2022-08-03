package LinkedList;

import static LinkedList.TraverseInLinkedList.printLL;

public class InsertInLinkedList {
    static void insertLL(int data, int position, Node<Integer> head){
        Node<Integer> newNode = new Node<>(data);
        if (position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node<Integer> cur = head;
        for (int i = 0; i <position-1 ; i++) {
            cur = cur.next;
            if (cur == null) return;

        }
        newNode.next = cur.next;
        cur.next = newNode;
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
        insertLL(100,3, n1);
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

