package Array1;



public class ReverseArray2 {
    public static void reverseArray(int[] a, int size) {

        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = a[i];
            a[i] = a[size - 1 - i];
            a[size - 1 - i] = temp;

        }
        for (int i = 0; i < size; i++) {


            System.out.print(a[i] + " ");

        }


}



    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        reverseArray(a, a.length);

    }

}
