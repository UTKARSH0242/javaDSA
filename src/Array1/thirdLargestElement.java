package Array1;


public class thirdLargestElement {
    public static int thirdLargest(int a[]){
        if (a.length < 3) return -2;
        int largest = 0;
        int secondLargest = -1;
        int thirdLargest = -2;

        for (int i = 1; i <a.length; i++) {
            if (a[i] > a[largest]){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            } else if (a[i] > a[secondLargest]) {
//                if (secondLargest == -1 || a[i] > a[secondLargest]);
                thirdLargest = secondLargest;
                secondLargest = i;

            } else if (a[i] > a[thirdLargest]) {
                thirdLargest = i;
            }
        }
        return thirdLargest;

    }


    public static void main(String[] args) {

        int a [] = {2,3,7,8,4};

        int index = thirdLargest(a);
        System.out.println(a[index]);

    }
}

