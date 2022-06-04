package Day1;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number = sc.nextInt();
        System.out.println("Enter the Second number");
        int number2 = sc.nextInt();
        int result = number * number2;

        System.out.println("The product of "+ number + " and "+ number2 + " is " +result );




    }
}
