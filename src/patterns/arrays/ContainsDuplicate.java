package patterns.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for(int i : nums) {
            if (numsSet.contains(i)) {
                return true;
            }
            numsSet.add(i);
        }
        return false;
    }
}
