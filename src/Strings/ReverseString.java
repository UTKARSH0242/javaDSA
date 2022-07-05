package Strings;

public class ReverseString {
    static String reverseString(String str){
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i);
//            return newStr;

        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "Hurrah!";
        System.out.println(reverseString(str));

    }
}
