package Patterns;

import java.util.Scanner;

public class HalfPyramidWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int n = sc.nextInt();
        //outer loop
        for (int rows = 1; rows <= n ; rows++) {
            //inner loop
            for (int cols = 1; cols <=rows; cols++) {
                System.out.print(cols+ " ");

            }
            System.out.println();

        }
    }
}
