import util.TimerUtility;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        String result = TimerUtility.measureExecutionTime(() -> maxSubArray(nums));

        System.out.println("Kadane's algorithm:\n" + result);
    }

    //Kadane's algorithm
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currentSum = 0;

        for (int n : nums) {
            if (currentSum < 0) currentSum = 0;

            currentSum += n;

            maxSub = Math.max(maxSub, currentSum);
        }
        return maxSub;
    }
}
