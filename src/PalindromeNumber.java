import util.TimerUtility;

public class PalindromeNumber {

    public static void main(String[] args) {
        int palindrome = 121121;

       String string = TimerUtility.measureExecutionTime(() -> isPalindromeToString(palindrome));
       String withoutString = TimerUtility.measureExecutionTime(() -> isPalindrome(palindrome));

        System.out.println("StringBuilder:\n" + string);
        System.out.println("Without converting:\n" + withoutString);
    }

    //StringBuilder
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static boolean isPalindromeToString(int x) {

        if (x < 0) return false;

        String palindrome = String.valueOf(x);
        String reversedPalindrome = new StringBuilder(palindrome).reverse().toString();

        return palindrome.equals(reversedPalindrome);
    }

    //Without converting
    //Time Complexity: O(log(x))
    //Space Complexity: O(1)
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temporary = x;

        while (temporary != 0) {
            int digit = (int) (temporary % 10);
            reversed = reversed * 10 + digit;
            temporary /= 10;
        }

        return (reversed == x);
    }
}
