package Mathematics;

public class SquareRoot {
    public static int squareRoot(int x){
        if (x == 0 || x == 1) return x;
        long start = 1, end = x, ans = 0;
        while (start<=end){
            long mid = start +(end-start) /2;
            if (mid * mid == x) return (int) mid;
            if (mid*mid < x){
                start = mid +1;
                ans = mid;
            }
            else {
                end = mid-1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int x = 9;
        System.out.println(squareRoot(x));


    }
}
