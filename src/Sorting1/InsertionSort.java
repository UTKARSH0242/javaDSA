package Sorting1;

public class InsertionSort {
    static void insertionSort(int [] arr){
        for (int i = 0; i< arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            for (; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,9,2,6,3,1,3};
        insertionSort(arr);
        for (int e: arr
             ) {
            System.out.print(e+" ");

        }

    }
}
