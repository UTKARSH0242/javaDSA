package Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();

        //OUTER LOOP
        for (int i = 1; i <=n; i++) {
            //INNER LOOP
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
