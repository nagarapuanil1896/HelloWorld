package com.practice;

import java.util.Scanner;

public class RemoveConsecutiveVowels1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Remove consecutive vowels from the string
        String result = removeConsecutiveVowels(inputString);

        // Output the result
        System.out.println("String after removing consecutive vowels: " + result);
    }

    // Function to remove consecutive vowels from a string using regular expressions
    private static String removeConsecutiveVowels(String inputString) {
        // Use regular expression to replace consecutive vowels with a single vowel
        String result = inputString.replaceAll("(?i)([aeiou])\\1+", "$1");

        return result;
    }
}
