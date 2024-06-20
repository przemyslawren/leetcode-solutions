import util.TimerUtility;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        String solution = TimerUtility.measureExecutionTime(() -> maxProfit(nums));

        System.out.println("Solution:\n" + solution);
    }

    //Sliding Window
    //Time Complexity: O(n)
    //Space complexity: O(1)
    public static int maxProfit(int[] prices) {
        int leftPointer = 0, rightPointer = 0; // left=buy right=sell

        int maxProfit = 0;

        while (rightPointer < prices.length) {
            if (prices[leftPointer] < prices[rightPointer]) {
                    int profit = prices[rightPointer] - prices[leftPointer];
                    maxProfit = Math.max(maxProfit, profit);
            } else {
                leftPointer = rightPointer;
            }
            rightPointer += 1;
        }
        return maxProfit;
    }
}
