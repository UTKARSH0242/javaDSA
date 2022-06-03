package DayTwo;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int sum = 0;
        int[] data = new int[n];
        for (int i = 0; i <n ; i++) {
            data[i] = sc.nextInt();

            sum += data[i];


        }
        System.out.println(sum);


    }
}
