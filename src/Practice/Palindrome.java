package Practice;

public class Palindrome {
    static boolean isPalindrome(int x){
        int r ; int sum =0; int temp =x;
        while (x>0){
            r = x%10;
            sum = (sum*10) + r;
            x = x/10;
        }
        if (temp == sum ){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x = 2002;
//        isPalindrome(x);
        System.out.println(isPalindrome(x));

    }
}
