import java.util.Arrays;
import java.util.HashSet;
import util.TimerUtility;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        String bruteForce = TimerUtility.measureExecutionTime(() -> containsDuplicateBruteForce(nums));
        String sorting = TimerUtility.measureExecutionTime(() -> containsDuplicateSorting(nums));
        String hashSet = TimerUtility.measureExecutionTime(() -> containsDuplicateHashSet(nums));

        System.out.println("Brute Force:\n" + bruteForce);
        System.out.println("Sorting:\n" + sorting);
        System.out.println("HashSet:\n" + hashSet);
    }

    //Brute force
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    //Sorting
    //Time Complexity: O(nlogn)
    //Space Complexity: O(1)
    public static boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    //HashSet
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int n : nums) {
            if (hashSet.contains(n)) {
                return true;
            }
            hashSet.add(n);
        }
        return false;
    }
}
