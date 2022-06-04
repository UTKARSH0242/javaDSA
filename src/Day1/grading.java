package Day1;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double math = sc.nextDouble();
        double science = sc.nextDouble();
        double hindi = sc.nextDouble();
        double english = sc.nextDouble();
        double sum = (math + science + hindi + english / 4) * 100;
        if (sum > 90) {
            System.out.println("Grade A");
        } else if (sum > 80) {
            System.out.println("Grade B");
        } else if (sum > 70) {
            System.out.println("Grade C");
        } else if (sum > 60) {
            System.out.println("D");
        } else if (sum > 33) {
            System.out.println("PASS");

        } else if (sum < 30) {
            System.out.println("fail");
        }
    }
}

