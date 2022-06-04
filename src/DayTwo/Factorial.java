package DayTwo;

import java.util.Scanner;

public class Factorial {
    public static void printFact(int n){
        if (n<0) {
            System.err.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >=1; i--) {
            factorial = factorial*i;


        }
        System.err.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number : ");
        int n = sc.nextInt();

        printFact(n);
    }

}