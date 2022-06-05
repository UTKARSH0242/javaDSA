package Patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of cols");
        int m = sc.nextInt();
//        int n = 4;
//        int m = 5;

        //OUTER LOOP
        for (int rows = 1; rows <=n ; rows++) {
            //INNER LOOP
            for (int cols = 1; cols <=m  ; cols++) {

                if (rows == 1 || cols == 1 || rows == n || cols == m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

}


