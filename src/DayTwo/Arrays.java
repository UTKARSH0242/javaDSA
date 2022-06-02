package DayTwo;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ageList = new int[n];
        for (int i = 0; i<n; i++){
            ageList[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            System.out.println("Age of roll no "+ (i +1) +" is "+ ageList[i]);
        }
    }
}
