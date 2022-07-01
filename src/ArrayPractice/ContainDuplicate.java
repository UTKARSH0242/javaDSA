package ArrayPractice;

import java.util.Arrays;

public class ContainDuplicate {
    static boolean containDuplicate(int[] nums){

        if (nums == null || nums.length < 2)
            return false;

        Arrays.sort(nums);

        int i = 1;
        while (i < nums.length) {
            if (nums[i - 1] == nums[i])
                return true;
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        containDuplicate(nums);

        System.out.println(containDuplicate(nums));
    }
}

