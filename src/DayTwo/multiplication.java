package DayTwo;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int multiple = n*i;
            System.out.println(multiple);



        }


    }
}
