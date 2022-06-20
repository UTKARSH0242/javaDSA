package ArrayPractice;

public class RepeatingElement {
        static void repeatingElement(int arr[], int n)
        {

            for (int i = 0; i < n; i++)
            {
                int index = arr[i] % n;
                arr[index] += n;
            }


            for (int i = 0; i < n; i++)
            {
                if ((arr[i] / n) >= 2)
                    System.out.print(i + " ");
            }
        }

        // Driver code
        public static void main(String args[])
        {
            int arr[] = { 1, 6, 3, 1, 3, 6, 6 };
            int arr_size = arr.length;

            System.out.println("The repeating elements are: ");


            repeatingElement(arr, arr_size);
        }
    }

