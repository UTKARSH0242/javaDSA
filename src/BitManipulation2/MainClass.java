package BitManipulation2;

import java.util.Arrays;


public class MainClass {
    public static long reverse(long A) {
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((A & (1 << i)) != 0)
                rev |= 1;
        }

        return rev;

    }
    static int swapTwoBits(int n , int i , int j ){
        int ith = (n >> i) & 1;
        int jth = (n>> j ) & 1;
        int xor = ith ^ jth;
        if (xor == 0 ) return n;
        int mask = (1 <<i) | ( 1<<j);
        return n ^ mask;
    }
    public static int[] twoNonRepeatingElements(int [] a){
        int xor = 0;
        for (int e:a) {
            xor = xor ^ e;

        }
        int temp = xor;
        int mask = xor & (~(xor -1));
        for (int e:a
             ) {
            if ((mask & e) ==0){
                temp = temp ^ e;
            }

        }
        int firstNum = temp;
        int secondNum = xor ^ firstNum;

        int[] res = new int[2];
        res[0] = firstNum;
        res[1] = secondNum;
        return res;
    }
    public static void main(String[] args) {
        int [] a = {2,1,4,1,2,3,4,7};
//        System.out.println(Arrays.toString(twoNonRepeatingElements(a)));
//        System.out.println( swapTwoBits(10,1,2));
        System.out.println(reverse(3));

        

    }
}
