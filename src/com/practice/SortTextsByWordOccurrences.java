package com.practice;
/*Write a program that receives a word A and some texts as input. You need to output the texts (without modifying them) in the ascending order of the number of occurrences of the word A in the texts. The input is as follows: an integer M(between 1 and 100, inclusive), followed by the word A in the next line, and some text in each of the M next lines.

        Note: The texts and the word A contain only lowercase Latin letters (a,b,c…,z) and blank spaces (“ ”). The maximum size of the texts and the word A is 100 Characters. Every text has a different number of occurrences of the word A.

        Note 2:you must print one text per line without modifying the texts.

        Example 1

        Input: 2
        Java
        I hate java
        Python is a good programming language
        Output: Python is a good programming language
        I hate java
        Example 2

        Input:  3
        python
        I like to code in python
        python is named after a show name monty python and not after the snake python
        I think python is good i think python is important than php
        Output: i like to code in python
        i think python is good i think python is important than php
        python is named after a show name monty python and not after the snake python*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortTextsByWordOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of texts
        System.out.println("Enter the number of texts (M):");
        int M = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Input the word A
        System.out.println("Enter the word A:");
        String wordA = scanner.nextLine().trim();

        // Create a map to store the occurrences of word A in each text
        Map<String, Integer> occurrencesMap = new HashMap<>();

        // Input and process each text
        for (int i = 0; i < M; i++) {
            System.out.println("Enter text " + (i + 1) + ":");
            String text = scanner.nextLine().trim();
            occurrencesMap.put(text, countOccurrences(text, wordA));
        }

        // Use a priority queue to sort texts by the number of occurrences
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(
                (entry1, entry2) -> entry1.getValue() - entry2.getValue()
        );

        priorityQueue.addAll(occurrencesMap.entrySet());

        // Output the sorted texts without modifying them
        System.out.println("Output:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll().getKey());
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

