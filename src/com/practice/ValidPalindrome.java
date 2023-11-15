package com.practice;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Function to remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "hello world";

        boolean output1 = isPalindrome(input1);
        boolean output2 = isPalindrome(input2);

        System.out.println(output1); // Should print true
        System.out.println(output2); // Should print false
    }
}
