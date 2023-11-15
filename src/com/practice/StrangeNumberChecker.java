package com.practice;

import java.util.Scanner;

public class StrangeNumberChecker {
    public static boolean isStrangeNumber(int n) {
        int distinctPrimeFactors = 0;

        // Count the distinct prime factors of the number
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                distinctPrimeFactors++;
                n /= i;
                // Check if there are more than two distinct prime factors
                if (distinctPrimeFactors > 2) {
                    return false;
                }
            }
        }

        if (n > 1) {
            distinctPrimeFactors++;
        }

        // Check if the number has exactly 2 distinct prime factors (is strange)
        return distinctPrimeFactors == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a strange number: ");
        int num = scanner.nextInt();

        if (isStrangeNumber(num)) {
            System.out.println(num + " is a strange number.");
        } else {
            System.out.println(num + " is not a strange number.");
        }

        scanner.close();
    }
}
