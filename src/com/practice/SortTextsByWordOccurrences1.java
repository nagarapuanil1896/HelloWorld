package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortTextsByWordOccurrences1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of texts
        System.out.println("Enter the number of texts (M):");
        int M = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Input the word A
        System.out.println("Enter the word A:");
        String wordA = scanner.nextLine().trim();

        // Create an array to store the texts
        String[] texts = new String[M];

        // Input the texts
        System.out.println("Enter the texts:");
        for (int i = 0; i < M; i++) {
            texts[i] = scanner.nextLine().trim();
        }

        // Sort the texts based on the number of occurrences of word A
        Arrays.sort(texts, (text1, text2) -> countOccurrences(text1, wordA) - countOccurrences(text2, wordA));

        // Output the sorted texts without modifying them
        System.out.println("Output:");
        for (String text : texts) {
            System.out.println(text);
        }
    }

    // Function to count the occurrences of a word in a text
    private static int countOccurrences(String text, String word) {
        int count = 0;
        int index = text.indexOf(word);
        while (index != -1) {
            count++;
            index = text.indexOf(word, index + 1);
        }
        return count;
    }
}
