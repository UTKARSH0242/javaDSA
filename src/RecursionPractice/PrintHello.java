package RecursionPractice;

import java.util.Scanner;

public class PrintHello {
    static void printHello(int n ){
        if (n==0){
            return;
        }
        System.out.println("Hello recursion");
        printHello(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHello(n);

    }
}
