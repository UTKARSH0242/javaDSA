package Recursion1;

public class DummyFunction {

    static int i = 0;
    static void DummyFunction(){
        System.out.println(i++);
        DummyFunction();
    }
    public static void main(String[] args) {
        DummyFunction();
    }
}
