package Hashing;

import java.util.HashSet;

public class TripletsSumEqualZero {
    static void findTriplets(int [] arr, int n){
        boolean ifFound = false;
        for (int i = 0; i <n-1 ; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i+1; j <n ; j++) {
                int x = -(arr[i] + arr[j]);
                if (set.contains(x)){
                    System.out.println(x+" "+arr[i]+" "+arr[j]);
                    ifFound = true;

                }else {
                    set.add(arr[j]);
                }

            }

        }
        if (ifFound == false){
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args) {
        int [] arr = {0,-1,2,-3,1};
        int n = arr.length;
        findTriplets(arr,n);
    }
}
