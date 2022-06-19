package Recursion1;

public class Power {
    static int power(int a, int b){
        if (b == 0) return 1;
        if (b == 1) return a;
        if (a == 0) return 0;

        return a*power(a, b-1);

    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(power(a ,b));
        power(a,b);

    }
}
