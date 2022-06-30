package ArrayPractice;

import java.util.Arrays;

public class ElementInMaximumSubArray {
    static void  elementInMaximumSubArray(int [] arr){
        int bestSum = arr[0];
        int bestStart = 0;
        int bestEnd = 0;
        int curSum = 0;
        int curStart = 0;
        for (int i = 0; i <arr.length ; i++) {
            curSum = curSum + arr[i];
            if (curSum<0){
                curSum = 0;
                curStart =i+1;

            } else if (curSum> bestSum) {
                bestSum = curSum;
                bestStart = curStart;
                bestEnd = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Continous Sub Array With Maximum Sum : ");

        System.out.print("[ ");
        for (int i = bestStart; i <= bestEnd ; i++) {
            System.out.print(arr[i] + " ");
//            System.out.println();

        }
        System.out.print("]");

        System.out.println();
        System.out.println(bestSum);
    }
    public static void main(String[] args) {
        elementInMaximumSubArray(new int []  {-2,1,-3,4,-1,2,1,-5,4});

    }
}
