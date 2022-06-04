package DayTwo;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 1;

        System.out.println("Numbers you want in Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.print("Fibonacci Series of "+a+" numbers:");

        for (int i = 1; i <= a; ++i)
        {
            System.out.print(b+" ");



            int sum = b + c;
            b = c;
            c = sum;
        }

    }

}