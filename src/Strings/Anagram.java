package Strings;

public class Anagram {
    static  boolean anagram(String str1 , String str2){
        int []  a = new int[256];
        for (int i = 0; i < str1.length() ; i++) {
            a[str1.charAt(i)]++;

        }
        for (int i = 0; i < str2.length() ; i++) {
            a[str2.charAt(i)]--;

        }
        for (int e : a) {
            if (e != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "abcda";
        String str2 = "adabc";
        System.out.println(anagram(str1,str2));

    }
}
