package Function;

import java.util.Scanner;

public class callingFunction {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); // called the function

    }
}
