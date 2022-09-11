package ArrayPractice;

import java.util.Arrays;

public class MoveAllNegativeAtLast {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-7,-5,11,6};
        int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
