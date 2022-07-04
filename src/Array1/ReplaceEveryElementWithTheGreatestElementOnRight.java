package Array1;

import java.util.Arrays;

public class ReplaceEveryElementWithTheGreatestElementOnRight {
    public static int[] replaceEveryElementWithTheGreatestElementOnRight(int [] a){
        int n = a.length;
      int max = a[n-1];
        a[n-1] = -1;
        for (int i =n-2 ; i >= 0 ; i--) {
            int temp = a[i];
            a[i] = max;

            if (temp> max){
                max = temp ;
            }

        }
        return a;

    }
    public static void main(String[] args) {
        int [] a = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceEveryElementWithTheGreatestElementOnRight(a)));






    }
}



