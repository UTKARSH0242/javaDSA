package Strings;

public class ReverseString {
    static String reverseString(String str){
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            newStr.append(str.charAt(i));
//            return newStr;

        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "Utkarsh Dubey";
        System.out.println(reverseString(str));

    }
}
