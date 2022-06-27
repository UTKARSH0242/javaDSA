package Mathematics;

import static java.lang.Math.min;

public class GCDOfTwoNumbers {
    public static int gcdOfTwoNumber(int a,int b){
        for (int i = min(a,b); i >1 ; i--) {
            if (a%i == 0 && b%i ==0)
                return i;

        }
        return 1;
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        System.out.println(gcdOfTwoNumber(24,36));

    }
}
