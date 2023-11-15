package com.practice;

import java.util.Scanner;

public class SubArrays {

        public static void printContiguousSubarrays(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
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

            System.out.println("Contiguous subarrays of the given array:");

            printContiguousSubarrays(arr);

            scanner.close();
        }

}
