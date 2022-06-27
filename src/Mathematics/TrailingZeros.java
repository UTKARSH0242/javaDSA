package Mathematics;

public class TrailingZeros {
    public static int trailingZeros(int n) {

        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
//            return res;

        }
        return res;
    }


    public static void main(String[] args) {
//        int n = 14;
//        System.out.println(res);
        System.out.println(trailingZeros(100));

    }
}
