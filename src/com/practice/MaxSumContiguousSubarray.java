package com.practice;

import java.util.Scanner;

public class MaxSumContiguousSubarray {
    public static void printMaxSumContiguousSubarray(int[] arr) {
        int n = arr.length;
        int maxSumSoFar = arr[0];
        int maxEndingHere = arr[0];
        int start = 0, end = 0;
        int s = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                maxEndingHere = arr[i];
                s = i;
            } else {
                maxEndingHere += arr[i];
            }

            if (maxEndingHere > maxSumSoFar) {
                maxSumSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }

        System.out.println("Maximum sum contiguous subarray:");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMaximum sum: " + maxSumSoFar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Contiguous subarray with maximum sum:");
        printMaxSumContiguousSubarray(arr);

        scanner.close();
    }
}
