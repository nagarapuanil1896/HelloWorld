package com.practice;

import java.util.Scanner;

public class NonRepeatDigitCount {
    public static boolean hasRepeatingDigit(int number) {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length(); i++) {
            char currentDigit = numStr.charAt(i);
            for (int j = i + 1; j < numStr.length(); j++) {
                if (currentDigit == numStr.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int countNonRepeatDigitNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!hasRepeatingDigit(i)) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.println("Start Position :");
        int start = scanner.nextInt();
        System.out.println("End Position :");
        int end = scanner.nextInt();

        int result = countNonRepeatDigitNumbers(start, end);
        System.out.println("Total Count: "+result);

        scanner.close();
    }
}
