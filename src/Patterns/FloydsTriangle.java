package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        //outer loop
        for (int rows = 1; rows <=n; rows++) {
            //INNER LOOP
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(number + " ");
                number++;

            }
            System.out.println();

        }
    }
}