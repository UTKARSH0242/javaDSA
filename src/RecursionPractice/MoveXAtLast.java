package RecursionPractice;

public class MoveXAtLast {
    public static void moveXAtLast(String str, int idx, int count, String newString){
        if (idx == str.length()){
            for (int i = 0; i <count ; i++) {
                newString += 'x';

            }
            System.out.println(newString);
            return;
        }
        char  curChar = str.charAt(idx);
        if (curChar == 'x'){
            count++;
            moveXAtLast(str, idx+1, count, newString);
        }else {
            newString += curChar;
            moveXAtLast(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveXAtLast(str,0,0,"");

    }
}
