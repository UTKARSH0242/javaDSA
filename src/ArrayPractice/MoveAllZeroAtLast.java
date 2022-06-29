package ArrayPractice;



public class MoveAllZeroAtLast {
    static void moveAllZeroAtLast(int [] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;
    }
    public static void main (String[] args)
    {
        int[] arr = {8,0,1,3,0,0,5};

        moveAllZeroAtLast(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}



