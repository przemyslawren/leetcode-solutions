public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = new char[] {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters, target));
        System.out.println(nextGreatestLetterBinarySearch(letters, target));

    }

    //No-brainer
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    private static char nextGreatestLetter(char[] letters, char target) {
        for (char i : letters) {
            if (i > target) {
                return i;
            }
        }
        return letters[0];
    }

    //Binary Search
    //Time Complexity: O(log n)
    //Space Complexity: O(1)
    private static char nextGreatestLetterBinarySearch(char[] letters, char target) {
        int leftPointer = 0, rightPointer = letters.length - 1;

        while (leftPointer <= rightPointer) {
            int middle = leftPointer + (rightPointer - leftPointer) / 2;
            if (letters[middle] > target) {
                rightPointer = middle - 1;
            } else {
                leftPointer = middle + 1;
            }
        }
        return letters[leftPointer % letters.length];
    }
}
