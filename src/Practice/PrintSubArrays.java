package Practice;

public class PrintSubArrays {
    static int[] arr = new int [] {1,2,3,4};
    static void PrintSubArrays(int n )
    {
        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = i; j <arr.length ; j++)
            {
                for (int k = i; k <=j ; k++)
                    System.out.print(arr[k] + " ");

                }

            }

        }

    public static void main(String[] args) {

        System.out.println(" subarrays");
        PrintSubArrays(arr.length);
    }
}
