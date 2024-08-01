package algorythms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {6,3,1,0,2,5,4,7};

        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    private static int[] selectionSort(int[] nums) {
        for (int leftPointer = 0; leftPointer < nums.length - 1; leftPointer++) {

            int minNumber = leftPointer;
            for(int rightPointer = leftPointer + 1; rightPointer < nums.length; rightPointer++) {
                if (nums[rightPointer] < nums[minNumber]) {
                    minNumber = rightPointer;
                }
            }

            int temp = nums[minNumber];
            nums[minNumber] = nums[leftPointer];
            nums[leftPointer] = temp;
        }
        return nums;
    }
}
