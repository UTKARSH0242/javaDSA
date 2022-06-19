package Recursion1;

public class CountPathInMatrix {
    static int countInPath(int n , int m){
        if (n == 1 || m == 1) return 1;

        int rightSide = countInPath(n , m-1);
        int downSide = countInPath(n-1, m);

        return rightSide + downSide;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countInPath(n, m));

    }
}
