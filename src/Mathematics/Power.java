package Mathematics;

public class Power {
    static int isPower(int A){
        if (A == 1) return 1;
        for (int i = 2; i < A ; i++) {
            if (i * i == A){
                return 1;

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int A = 1;
        System.out.println(isPower(A));
    }
}
