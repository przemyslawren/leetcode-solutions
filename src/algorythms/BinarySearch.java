package algorythms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 4;

        System.out.println(binarySearch(arr, target));
    }

    // Has to be sorted
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    private static int binarySearch(int[] arr, int target) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        while (leftPointer <= rightPointer) {
            int middle = (leftPointer + rightPointer) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] < target) {
                leftPointer = middle + 1;
            } else {
                rightPointer = middle - 1;
            }
        }
        return -1;
    }
}
