package LinkedList2;

public class DeleteMiddleOfLinkedList {

    static class Solution{
        Node deleteMid(Node head)
        {
            if (head == null) return null;
            if (head.next == null)
                return null;
            Node prev = null;
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null)
            {
                fast = fast.next.next;
                prev = slow;
                slow = slow.next;
            }
            prev.next = slow.next;
            return head;
        }
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

        




    }
}


