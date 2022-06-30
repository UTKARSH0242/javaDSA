package BitManipulation;

public class MainClass {
    static  int countSetBit(int n ){
        int count = 0;
        while (n> 0){
            if ((n &1) == 1){
                count++;
            }
            n  = n>>1;
        }
        return count;
    }
    static int toggleWithIThBit(int n , int i){
        int mask = 1<< i;
        return n^mask;
//        return n;
    }
    static boolean isPowerOfTwo(int n ){
        int res = n & (n-1);
        return  res == 0;
    }
    static int findIthBit(int n , int i ){
        int mask = 1<< i;
        int result = n&mask;

        if (result == 0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        int n = 5;
        int b = 6;
//        System.out.println(~a + " " + b);
//        System.out.println(findIthBit(n,0));

        System.out.println(countSetBit(15));
    }
}
