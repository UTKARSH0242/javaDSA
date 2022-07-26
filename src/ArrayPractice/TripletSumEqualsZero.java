package ArrayPractice;

public class TripletSumEqualsZero {
    static void findTriplets(int [] arr, int n ){
        boolean ifFound = false;
        for (int i = 0; i<n-2; i++){
            for (int j = i+1; j <n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        ifFound = true;
                    }

                }

            }
            if (ifFound== false)
                System.out.println("triplet dosnt exist");
        }
    }
    public static void main(String[] args) {
        int []arr = {0,-1,2,-3,1};
        int n = arr.length;
        findTriplets(arr, n);
    }
}
