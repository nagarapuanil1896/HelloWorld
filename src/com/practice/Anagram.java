package com.practice;
import java.util.Arrays;
public class Anagram {

        public static boolean areAnagrams(String str1, String str2) {
            // Remove spaces and convert to lowercase to make the comparison case-insensitive
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Check if the lengths of the two strings are equal
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert the strings to character arrays and sort them
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted character arrays
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String input1 = "listen";
            String input2 = "silent";
            boolean output1 = areAnagrams(input1, input2);
            System.out.println(output1); // Should print true

            String input3 = "hello";
            String input4 = "world";
            boolean output2 = areAnagrams(input3, input4);
            System.out.println(output2); // Should print false
        }

}
