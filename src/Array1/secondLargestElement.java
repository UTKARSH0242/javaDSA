package Array1;

public class secondLargestElement {
    public  static int secondLargest(int[] arr){
        int largest = -1;
        int secondLargest = -1;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]> largest){
                secondLargest = largest;
                largest = i;

            }else if (arr[i]< largest) {
                if (secondLargest == -1 || arr[i] >secondLargest) {
                    secondLargest = i;
                }
            }

        }
        return secondLargest;

    }
    public static void main(String[] args) {

        int[] arr= {2,2,2,2,2};
//        int key = 6;
        int index = secondLargest(arr);
        System.out.println(arr[index]);


    }
}


/* Time Complexity = Θ(n) */
