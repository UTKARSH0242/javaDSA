package ArrayPractice;

import java.util.Arrays;

public class ContainDuplicate {
    static boolean containDuplicate(int nums[]){

        if (nums == null || nums.length < 2)
            return false;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++)
            if (nums[i - 1] == nums[i])
                return true;

        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
//        containDuplicate(nums);

        System.out.println(containDuplicate(nums));
    }
}

