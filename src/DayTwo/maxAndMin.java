package DayTwo;

import java.util.Arrays;
import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n ; i++) {
            number[i] = sc.nextInt();

        }
        Arrays.sort(number);
        System.out.println("The min is "+ number[0]+ " and the max is "+ number[n-1]);
//        System.out.println("The min is "+ number[0]);
    }
}
