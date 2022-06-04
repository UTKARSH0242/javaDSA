package Day1;

import java.util.Scanner;

public class meterconversion {
    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double result = number * 0.0254;

        System.out.println(result);


    }
}
