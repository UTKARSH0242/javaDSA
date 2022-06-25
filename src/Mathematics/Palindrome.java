package Mathematics;

public class Palindrome {

    public static boolean palindromeNumbers(int n ){
        int rev = 0;
        int temp = n;
        while (temp > 0){
            int lastDigit = temp%10;
            rev = rev * 10 +lastDigit;
            temp /= 10;
        }
        return n == rev;
    }
    public static void main(String[] args) {
        int n = 1221;
        System.out.println(palindromeNumbers(n));

    }
}
