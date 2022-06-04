package Day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year ");
        Scanner sc  = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0){
            System.out.println("This "+ year +" is leap Year");

        }else
            System.out.println("This "+ year +" is normal year");
    }
}

