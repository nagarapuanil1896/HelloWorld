package com.practice;

/*Write a program that will take one string as input.
        The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string.
        If there are two or more vowels that occur together then the program shall ignore all of those vowels.*/
import java.util.Scanner;

public class RemoveConsecutiveVowels {
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

    // Function to remove consecutive vowels from a string
    private static String removeConsecutiveVowels(String inputString) {
        StringBuilder result = new StringBuilder();
        int length = inputString.length();
        boolean isPreviousVowel = false;

        for (int i = 0; i < length; i++) {
            char currentChar = inputString.charAt(i);

            // Check if the current character is a vowel (ignoring case)
            boolean isVowel = "aeiouAEIOU".indexOf(currentChar) != -1;

            // If the current character is a vowel and the previous character was also a vowel, skip it
            if (isVowel && isPreviousVowel) {
                continue;
            }

            // Append the current character to the result
            result.append(currentChar);

            // Update the flag for the previous character being a vowel
            isPreviousVowel = isVowel;
        }

        return result.toString();
    }
}

