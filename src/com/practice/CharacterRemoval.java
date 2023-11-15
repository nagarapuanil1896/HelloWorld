/* Find how many characters must be removed in a string of a character series to get a common difference of the count
of different characters. If no characters need to remove then print "NA".

Input
----------------
aaaaabbc
1

Output
----------------
2

Process
----------------
Number of a : 5
Number of b : 2
Number of c : 1
Common difference : 1

5(a) - 2(b) = 3(extra 3 a are there), so we should remove 3-1= 2(a)
2(b) - 1(c) = 1, no charactres should remove
Hence the output = 2.

*/
package com.practice;

import java.util.Scanner;

public class CharacterRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string and common difference
        System.out.println("Enter the String : ");
        String inputString = scanner.nextLine();
        System.out.println("Enter the Difference :");
        int commonDifference = scanner.nextInt();

        // Create an array to store the count of each character
        int[] count = new int[26]; // Assuming only lowercase English alphabet characters

        // Count the occurrences of each character in the string
        for (char c : inputString.toCharArray()) {
//            System.out.println(c);
            count[c - 'a']++;
            System.out.println(c + ": " +count[c-'a']);
        }

        int removals = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] > commonDifference) {
                removals += (count[i] - commonDifference);
            }
        }

        if (removals == 0) {
            System.out.println("NA");
        } else {
            System.out.println(removals);
        }

        scanner.close();
    }
}

