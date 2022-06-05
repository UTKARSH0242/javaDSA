package Patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int n = sc.nextInt();

        //outer loop

        for (int rows = 1; rows <=n ; rows++) {
            //inner loop -> for printing space

            for (int cols = 1; cols <=n-rows ; cols++) {
                System.out.print(" ");

            }
            //inner loop -> for printing star
            for (int cols = 1; cols <=rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
