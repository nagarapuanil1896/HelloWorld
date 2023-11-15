package com.practice;

import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case insensitivity
        boolean[] alphabetPresent = new boolean[26]; // Assuming only lowercase letters

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a pangram: ");
        String inputString = scanner.nextLine();

        if (isPangram(inputString)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }

        scanner.close();
    }
}

