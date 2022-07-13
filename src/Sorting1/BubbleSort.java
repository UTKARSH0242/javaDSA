package Sorting1;

public class BubbleSort {
    static void swap(int [] a , int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]> arr[j+1]){
                    isSwapped = true;
                swap(arr,j,j+1);
                }

            }
            if (!isSwapped) break;

        }
    }
    public static void main(String[] args) {
        int [] arr = {5,9,2,6,3,1,3};
        bubbleSort(arr);
        for (int e:arr
             ) {
            System.out.print(e + " ");
            
        }

    }
}
