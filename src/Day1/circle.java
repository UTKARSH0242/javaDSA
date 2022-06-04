package Day1;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        double pie = 3.14;
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double areaOfCircle = (pie*(radius*radius));
        double perimeterOfCircle = (2 * pie * radius);

        System.out.println(perimeterOfCircle);
        System.out.println(areaOfCircle);

    }
}
