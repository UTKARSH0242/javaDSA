package Patterns;

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            // for spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            // for stars
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
