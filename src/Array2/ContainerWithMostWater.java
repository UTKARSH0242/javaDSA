package Array2;

public class ContainerWithMostWater {

    // Two pointer Approach
    static int containerWithMostWater(int a[]) {
            int maxArea = 0;
            int left = 0;
            int right = a.length - 1;

            while (left < right) {
                int height = Math.min(a[left], a[right]);
                int distance = right - left;

                int area = height * distance;
                maxArea = Math.max(maxArea, area);

                if (a[left] < a[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return maxArea;
        }


            public static void main(String[] args) {
                int a[] = {1, 8, 6, 2, 4, 5, 8, 3, 7};
                int b[] = {1, 1};
                int answer = containerWithMostWater(a);
                int answer2 = containerWithMostWater(b);
                System.out.println(answer2);

                System.out.println(answer);
            }


}

