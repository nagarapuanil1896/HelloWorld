package com.practice;

/*Given an array, Arr[] of size T, contains binary digits, where

        0 represents a biker running to the north.
        1 represents a biker running to the south.
        The task is to count crossing biker in such a way that each pair of crossing biker(N, S), where 0<=N<S<T, is passing when N is running to   the north and S is running to the south.

        Constraints: 0<=N<S<T

        Example 1- Input :

        5 -> Number of elements i.e. T
        0 -> Value of 1st element.
        1 -> Value of 2nd element
        0 -> Value of 3rd element.
        1 -> Value of 4th element.
        1 -> Value of 5th element
        Output : 5*/
import java.util.Scanner;

public class CrossingBikers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.println("Enter the number of elements:");
        int t = scanner.nextInt();

        // Input array elements
        int[] arr = new int[t];
        System.out.println("Enter the array elements (0 or 1):");
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count the crossing bikers
        int count = countCrossingBikers(arr);

        // Output the result
        System.out.println("Number of crossing bikers: " + count);
    }

    // Function to count crossing bikers
    private static int countCrossingBikers(int[] arr) {
        int count = 0;
        int northCount = 0;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // Biker running to the north
                northCount++;
            } else {
                // Biker running to the south
                count += northCount;
            }
        }

        return count;
    }
}
