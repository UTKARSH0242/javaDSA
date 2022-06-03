package DayTwo;

import java.util.Scanner;

public class greaterAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of element");
        int n = sc.nextInt();
        int[] marks = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " th number");
            marks[i] = sc.nextInt();

//            double averageMarks = marks[i]/n;
//            System.out.println(averageMarks);
            sum += marks[i];
        }
        System.out.println(sum);
        double averageMarks = (sum / n);
        for (int j = 0; j < n; j++) {
            if (marks[j] > averageMarks) {
                System.out.println(marks[j]);
            }
        }
    }
}
