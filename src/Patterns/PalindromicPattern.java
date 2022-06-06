package Patterns;


import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n  = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }

            // 1st half number
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);


            }
            ///2nd half
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);



            }
            System.out.println();

        }

    }
}
