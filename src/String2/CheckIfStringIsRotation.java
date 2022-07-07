package String2;

public class CheckIfStringIsRotation {
    static boolean rotationalString(String s1 , String s2){
        if (s1.length() != s2.length()) return false;
        String doubleString = s1+s2;
        return doubleString.contains(s2);
    }
    public static void main(String[] args) {

    }
}
