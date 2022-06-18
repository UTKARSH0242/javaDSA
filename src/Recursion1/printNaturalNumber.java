package Recursion1;

public class printNaturalNumber {
    static void PrintNaturalNumbers(int N){
        if (N == 0) return;

        PrintNaturalNumbers(N-1);
        System.out.print(N+ " ");


    }
    public static void main(String[] args) {
        PrintNaturalNumbers(5);

    }
}
