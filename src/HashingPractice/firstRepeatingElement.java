package HashingPractice;

import java.util.HashSet;

public class firstRepeatingElement {
    static int firstRepeatingElement(int [] arr){
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i< arr.length-1; i++){
            if (set.contains(arr[i]))

                return i;
            else return -1;

        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {1,5,3,4,3,5,6};
        System.out.println(firstRepeatingElement(arr));


    }
}
