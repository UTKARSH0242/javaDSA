package Arrays;

public class secondLargestElement {
    public  static int secondLargest(int a[]){
        int largest = 0;
        int secondLargest = -1;
        for (int i = 1; i <a.length ; i++) {
            if (a[i]> a[largest]){
                secondLargest = largest;
                largest = i;

            }else if (a[i]< a[largest]) {
                if (secondLargest == -1 || a[i] > a[secondLargest]) {
                    secondLargest = i;
                }
            }

        }
        return secondLargest;

    }
    public static void main(String[] args) {

        int[] a = {2,1,4,6,5};
//        int key = 6;
        int index = secondLargest(a);
        System.out.println(a[index]);


    }
}


/* Time Complexity = Θ(n) */
