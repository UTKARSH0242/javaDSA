package QueueBasics;

//import LinkedList2.Node;

public class QueueUsingLL {
    private Node front ,rear;
    void enqueue(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }
    boolean isEmpty(){
        return front == null;
    }
    int getFront() throws Exception{
        if (isEmpty()) throw new  Exception("Queue is Empty");
        return front.data;
    }
    int dequeue() throws Exception{
        if (isEmpty()) throw new Exception("Queue is Empty");
        int ans = front.data;
        front = front.next;
        return ans;
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data= data;
    }
}

