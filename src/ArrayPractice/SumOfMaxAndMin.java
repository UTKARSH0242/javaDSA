package ArrayPractice;

public class SumOfMaxAndMin {
    static int sumOfMaxAndMin(int [] arr){
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <n ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }else if (arr[i] < min){
                min = arr[i];

            }


        }
        return max+min;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,6,6};
        System.out.println(sumOfMaxAndMin(arr));


    }
}
