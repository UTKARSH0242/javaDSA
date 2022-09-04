package Stack;

public class MainClass {
    public static void main(String[] args) throws Exception {

        ImplementStackUsingArray stack = new ImplementStackUsingArray(3);

        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(9);

        System.out.println(stack.pop());
    }
}
