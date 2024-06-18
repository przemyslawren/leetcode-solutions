import util.TimerUtility;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        final int VALUE = 2;

        String result = TimerUtility.measureExecutionTime(() -> removeElement(nums, VALUE));

        System.out.println("Solution:\n" + result);
    }

    //A la partition from quicksort
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k += 1;
            }
        }
        return k;
    }
}
