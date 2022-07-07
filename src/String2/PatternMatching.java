package String2;

public class PatternMatching {
    static void patternMatching(String str1 , String str2){
        int m = str1.length();
        int n = str2.length();

        for (int i = 0; i <=m-n ; i++) {
            int j;
            for (j = 0; j<n; j++){
                if (str1.charAt(i+j) != str2.charAt(j)){
                    break;
                }
            }
            if (j == m){
                System.out.println("pattern found at " + i);
            }

        }
    }
    public static void main(String[] args) {
        String str1 = "abcabdabbacbdabda";
        String str2 = "bda";
        patternMatching(str1, str2);

    }
}

//    static void patternMatching(String s, String p) {
//        int n = s.length();
//        int m = p.length();
//
//        for(int i = 0; i<=n-m; i++) {
//            int j = 0;
//            for(; j<m; j++) {
//                if(s.charAt(i+j) != p.charAt(j)) {
//                    break;
//                }
//            }
//            if(j == m) {
//                System.out.println("pattern found at "+i);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        String s = "abcabdabbacbdabda";
//        String p = "bda";
//
//        patternMatching(s, p);
//    }
//
//}
