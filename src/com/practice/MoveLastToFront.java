package com.practice;

import java.util.Scanner;

public class MoveLastToFront {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number of iterations
        int iterations = scanner.nextInt();

        // Perform the operation for the specified number of iterations
        for (int i = 0; i < iterations; i++) {
            int lastElement = arr[n - 1];

            // Shift elements to the right
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            // Move the last element to the front
            arr[0] = lastElement;
        }

        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
