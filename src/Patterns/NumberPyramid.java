package Patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");


            }
            //number --> print row number, row time
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");

            }
            System.out.println();


        }
    }
}
