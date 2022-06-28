package Mathematics2;

import java.util.Arrays;



public class SieveOfEratosthenes {
    public static void printAllPrime(int n ){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i*i<=n ; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (isPrime[i]) System.out.println(i);

        }
    }
    public static void main(String[] args) {
        printAllPrime(20);

    }
}
