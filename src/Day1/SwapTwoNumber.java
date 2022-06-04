package Day1;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number x ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter the number y ");
        int y = sc.nextInt();

        System.out.println("Before Swapping x =" +x+ " and y = "+y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping x =" +x+ " and y = "+y);



    }
}
