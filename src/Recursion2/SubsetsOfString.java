package Recursion2;

public class SubsetsOfString {
    static void subSetOfString(String str){
        utilsubSetOfString(str,0,"");

    }
    static void utilsubSetOfString(String str , int i , String cur){
        if (i == str.length()){
            System.out.println(cur);
            return;
        }
        utilsubSetOfString(str, i+1, cur);
        utilsubSetOfString(str, i+1 , cur + str.charAt(i));
    }
    public static void main(String[] args) {

       utilsubSetOfString("abc",0,"");

    }
}
