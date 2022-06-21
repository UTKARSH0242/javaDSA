package Recursion2;

public class SumOfDigits {
    static int sumOfDigits(int n ){
        System.out.println(n);
        if (n == 0) return 0;

        int lastDigits = n % 10;
        return lastDigits + sumOfDigits(n/10);
//        int sum = 0;
//        while (n>0);{
//            sum += n%10;
//            n /= 10;
//        }
//        return sum;
    }
    public static void main(String[] args) {

        int n = 2314;
        System.out.println(sumOfDigits(n));

    }
}
