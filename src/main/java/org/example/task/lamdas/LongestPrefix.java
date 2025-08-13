package org.example.task.lamdas;

public class LongestPrefix {
    public static String longestPrefex(String[] str){
        if (str == null || str.length == 0){
            return "";
        }
        String prefix = str[0];

        for (int i = 0; i < str.length; i++) {
            while (!str[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);

                if (prefix.isEmpty()){
                    return " ";
                }
            }

        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        String[] words1 = {"dog","racecar","car"};
        System.out.println(longestPrefex(words));
        System.out.println(longestPrefex(words1));
    }
}
