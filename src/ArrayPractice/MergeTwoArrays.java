package ArrayPractice;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {50,60,70,80,90,100};
        int a1 = arr1.length;
        int b1 = arr2.length;
        int c1 = a1 + b1;
        int [] arr3 = new int[c1];

        for (int i = 0; i <a1 ; i++) {
            arr3[i] = arr1[i];

        }
        for (int i = 0; i <b1 ; i++) {
            arr3[a1+i] = arr2[i];

        }
        for (int i = 0; i <c1 ; i++) {
            System.out.print(arr3[i]+ " ");

        }


    }
}
