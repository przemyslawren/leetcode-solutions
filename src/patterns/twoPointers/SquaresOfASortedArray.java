package patterns.twoPointers;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquaresBruteForce(nums)));
        System.out.println(Arrays.toString(sortedSquaresTwoPointers(nums)));
    }

    public static int[] sortedSquaresBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquaresTwoPointers(int[] nums) {
        int[] result = new int[nums.length];

        int leftPointer = 0, rightPointer = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[leftPointer]) > Math.abs(nums[rightPointer])) {
                result[i] = (int)Math.pow(nums[leftPointer], 2);
                leftPointer++;
            } else {
                result[i] = (int)Math.pow(nums[rightPointer], 2);
                rightPointer--;
            }
        }
        return result;
    }
}
