package RecursionPractice;

public class RodCuttingProblem {
    static int rodCuttingProblem(int N , int a , int b , int c ){
        if (N == 0) return 0;

        if (N<0) return -1;

        int cutA = rodCuttingProblem(N-a,a,b,c);
        int cutB = rodCuttingProblem(N-b,a,b,c);
        int cutC = rodCuttingProblem(N-c,a,b,c);

        int res =  Math.max(cutA, Math.max(cutB,cutC));
        if (res == -1) return -1;
        return res +1;
    }
    public static void main(String[] args) {
        int N = 25;
        int a = 5;
        int b= 7;
        int c = 13;
        System.out.println(rodCuttingProblem(N,a,b,c));
    }
}
