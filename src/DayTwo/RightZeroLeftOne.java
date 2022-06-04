package DayTwo;

import java.util.Arrays;
import java.util.Scanner;

public class RightZeroLeftOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));




    }
}
