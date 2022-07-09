package Strings;

public class LengthOfLastWord {
    static int lengthOfTheLastWord(String str){
        int length = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                length++;
            } else {

                break;
            }

        }
        return length;


    }
    public static void main(String[] args) {
//        String str = "I am boss of this company";
        String str = "hkrrtbxwkabeihgcdqew         ";
        System.out.println(lengthOfTheLastWord(str));
    }
}
