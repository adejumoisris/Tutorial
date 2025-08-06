package org.example.task.lamdas.hashtable;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Roman numeral values and their symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {
                "M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));      // Output: III
        System.out.println(intToRoman(58));     // Output: LVIII
        System.out.println(intToRoman(1994));   // Output: MCMXCIV
    }
}
