package Patterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        for (int rows = n; rows >=1 ; rows--) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print("* ");


            }
            System.out.println();

        }
    }
}
