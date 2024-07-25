package patterns.twoPointers;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 18)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int leftPointer = 0, rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];

            if (sum == target) {
                return new int[] {leftPointer, rightPointer};
            } else if (sum < target) {
                leftPointer += 1;
            } else {
                rightPointer -= 1;
            }
        }
        return new int[] {};
    }
}
