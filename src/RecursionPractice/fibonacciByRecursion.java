package RecursionPractice;

public class fibonacciByRecursion {
    public static void fibonacciSeries(int a , int b , int n){
        if (n == 0){
            return;
        }
        int c = a+b;
        System.out.print(c+ " ");
        fibonacciSeries(b,c,n-1);
    }
    public static void main(String[] args) {
        int a= 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b+" ");
        int n = 7;
        fibonacciSeries(a,b, n-2);
    }
}
