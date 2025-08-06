package org.example.task.lamdas.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = map.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (currentVal < nextVal) {
                total -= currentVal;  // Subtract when smaller than next
            } else {
                total += currentVal;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));       // Output: 3
        System.out.println(romanToInt("LVIII"));     // Output: 58
        System.out.println(romanToInt("MCMXCIV"));   // Output: 1994
    }
}
