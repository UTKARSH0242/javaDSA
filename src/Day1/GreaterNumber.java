package Day1;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int n1 = sc.nextInt();
        System.out.println("Enter the Number 2");
        int n2 = sc.nextInt();
        System.out.println("Enter the Number 3");
        int n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println("the greatest number is " + n1);
        } else if (n1 < n2 && n3 > n2) {
            System.out.println("the greatest number is " + n3);

        } else
            System.out.println("the greatest number is " + n2);

    }
}
