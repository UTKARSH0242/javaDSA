package Stack;

public class ImplementStackUsingArray {
    int a[];
    int capacity;
    int top;

    public ImplementStackUsingArray(int capacity){
        this.capacity = capacity;
        a = new int[capacity];
        top = -1;
    }
    void push(int element){
        if(top == capacity-1) return;
        top++;
        a[top] = element;
    }
    int pop() throws Exception {
        if(top == -1) throw new Exception("Stack is Empty");
        int ans = a[top];
        top--;
        return ans;
    }
    int peak() throws Exception{
        if(top == -1) throw new Exception(("Stack is Empty"));
        return a[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
    int size(){
        return top+1;
    }

}


