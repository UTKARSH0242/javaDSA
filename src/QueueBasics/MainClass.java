package QueueBasics;

public class MainClass {
    public static void main(String[] args) throws Exception {


//        QueueUsingLL qLL = new QueueUsingLL();
        QueueUsingCircularArray q = new QueueUsingCircularArray(4);

//        QueueUsingArray q = new QueueUsingArray(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

//        System.out.println(q.getFront());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

//        System.out.println(q.dequeue());


    }
}
