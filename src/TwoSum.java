import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import util.TimerUtility;

class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        final int TARGET = 9;

        String bruteForce = TimerUtility.measureExecutionTime(() -> bruteForce(arr, TARGET));
        String twoPointers = TimerUtility.measureExecutionTime(() -> twoPointers(arr, TARGET));
        String hashMap = TimerUtility.measureExecutionTime(() -> hashMap(arr, TARGET));

        System.out.println("Brute Force:\n" + bruteForce);
        System.out.println("\nTwo Pointers:\n" + twoPointers);
        System.out.println("\nHash Map:\n" + hashMap);
    }

    //Brute force
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    private static int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    //Two pointers, have to be sorted (won't work on LeetCode because of changing original indices)
    //Sorting: O(nlogn)
    //Two pointer search: O(n)
    //Time Complexity: O(nlogn)
    //Space Complexity: O(1)
    private static int[] twoPointers(int[] nums, int target) {
        Arrays.sort(nums);

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];
            if (sum < target) {
                leftPointer += 1;
            } else if (sum > target) {
                rightPointer -= 1;
            } else {
                return new int[] {leftPointer, rightPointer};
            }
        }
        return new int[] {};
    }

    //Hash map
    //Time complexity: O(n)
    //Space complexity: O(n)
    private static int[] hashMap(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[] {numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }

        return new int[] {};
    }
}