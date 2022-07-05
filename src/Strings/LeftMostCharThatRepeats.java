package Strings;

public class LeftMostCharThatRepeats {
    static char leftMostCharThatRepeats(String str) {
        char ans = 0;
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j)) {
                    ans = str.charAt(i);
                    flag = 1;
                    break;
                }
            if (flag == 1){
                break;
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "ananya";
        System.out.println(leftMostCharThatRepeats(str));


    }
}
