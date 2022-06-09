package Function;

import java.util.Scanner;

public class Product {
    public static int calculateProduct(int a, int b){

        int sum = a * b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();

        int sum = calculateProduct(a , b);
        System.out.println(sum);
    }
}
