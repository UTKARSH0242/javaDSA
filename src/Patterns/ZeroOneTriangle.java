package Patterns;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        //outer loop
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                int sum = rows+cols;
                if(sum % 2 == 0){
                    System.out.print("1 ");

                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
