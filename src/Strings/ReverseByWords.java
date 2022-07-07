package Strings;

public class ReverseByWords {
//    static void reverseCharacters(char[] s, int i, int j) {
//        while(i < j) {
//            char temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//
//            i++;
//            j--;
//        }
//    }
//    static String reverseWords(String s) {
//        char[] c = s.toCharArray();
//
//        int start = 0;
//        int end = 0;
//        for(; end < s.length(); end++) {
//            if(c[end] == ' ') {
//                reverseCharacters(c, start, end-1);
//                start = end + 1;
//            }
//        }
//        reverseCharacters(c, start, end-1);
//
//        reverseCharacters(c, 0, s.length()-1);
//        return new String(c);
//    }
    public static String reverseWords(String s) {

        int i = s.length() - 1;

        String ans = "";

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') i--;

            int j = i;

            if (i < 0) break;

            while (i >= 0 && s.charAt(i) != ' ') i--;

            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(" " + s.substring(i + 1, j + 1));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "Never Give Up";
        String ans = reverseWords(s);
        System.out.println(ans);

    }
}
