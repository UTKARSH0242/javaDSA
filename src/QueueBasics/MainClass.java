package QueueBasics;

public class MainClass {
    public static void main(String[] args) throws Exception {


        QueueUsingLL qLL = new QueueUsingLL();

        qLL.enqueue(10);
        qLL.enqueue(20);
        qLL.enqueue(30);
        qLL.enqueue(40);

        System.out.println(qLL.getFront());
        System.out.println(qLL.dequeue());
        System.out.println(qLL.dequeue());
        qLL.enqueue(50);
        System.out.println(qLL.dequeue());
        System.out.println(qLL.dequeue());
        System.out.println(qLL.dequeue());
//        System.out.println(qLL.dequeue());


    }
}
