package algorythms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 7, 4, 2, 6};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    //Time Complexity:
    //Worst case: O(n^2), when it is sorted backwards
    //Average case: O(n^2)
    //Best case: O(n) when it is sorted
    //Space Complexity: O(1)
    private static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
