package Patterns;

import java.util.Scanner;

public class invertedPyramidWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        //outer loop
        for (int rows = 1; rows <= n; rows++) {
            //inner loop
            for (int cols = 1; cols <=n-rows+1 ; cols++) {
                System.out.print(cols);


            }
            System.out.println();




        }


    }
}
