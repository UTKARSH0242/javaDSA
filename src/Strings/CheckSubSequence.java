package Strings;

public class CheckSubSequence {
    static boolean checkSubsequence(String str){
//        return str.contains("abbc");
        return str.contains("abc");
    }
    public static void main(String[] args) {
        String str = "paabcbbcd";
        System.out.println(checkSubsequence(str));


    }
}
