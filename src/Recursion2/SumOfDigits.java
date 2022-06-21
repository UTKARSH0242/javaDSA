package Recursion2;

public class SumOfDigits {
    static int sumOfDigits(int n ){
//        System.out.println(n);
        if (n == 0) return 0;

        int lastDigits = n % 10;
        return lastDigits + sumOfDigits(n/10);
    }
    public static void main(String[] args) {

        int n = 2314;
        System.out.println(sumOfDigits(n));

    }
}
