import java.util.Map;
import util.TimerUtility;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "MCMXCIV";

        String hashMap = TimerUtility.measureExecutionTime(() -> romanToInt(roman));

        System.out.println("Hash Map:\n" + hashMap);
    }

    //HashMap
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map
                .of(
                        'I',1,
                        'V',5,
                        'X',10,
                        'L',50,
                        'C',100,
                        'D',500,
                        'M',1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i + 1 < s.length()) && (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1)))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }
        return result;
    }
}
