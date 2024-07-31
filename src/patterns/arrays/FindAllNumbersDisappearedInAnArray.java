package patterns.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] temp = new int[nums.length];

        for (int num : nums) {
            temp[num - 1] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp[i] == 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
