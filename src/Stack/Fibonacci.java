package Stack;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        System.out.println("fibonacci Number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("fibonacci of series" + a + "is :");
        for (int i = 1; i <=a ; i++) {
            System.out.print(b+" ");
            int temp = b+c;
            b = c;
            c = temp;

        }

    }
}
