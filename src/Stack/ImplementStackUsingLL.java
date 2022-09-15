package Stack;

public class ImplementStackUsingLL {
    Node head;
    int size = 0;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    void push(int element){
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }
    int pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty");
        int ans = head.data;
        head = head.next;
        size--;
        return  ans;


    }
    int peak() throws Exception {
        if (isEmpty()) throw new Exception("Stack is Empty");
        return head.data;

    }
    int size(){
        return size;

    }
    boolean isEmpty(){
        return size == 0;

    }

}
