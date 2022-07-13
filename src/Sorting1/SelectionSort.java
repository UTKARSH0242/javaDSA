package Sorting1;

public class SelectionSort {
    static void swap(int [] a , int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void selectionSort(int [] arr){
//        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i++) {
            int smallest = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
                
            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
            swap(arr, smallest, i);

        }
    }
    public static void main(String[] args) {
        int [] arr = {7,8,3,1,2};
        selectionSort(arr);
        for (int e: arr
             ) {
            System.out.print(e + " ");

        }

    }
}
