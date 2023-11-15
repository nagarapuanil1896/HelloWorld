package com.practice;

/*Joseph is learning digital logic subject which will be for his next semester.
        He usually tries to solve unit assignment problems before the lecture.
        Today he got one tricky question. The problem statement is “A positive integer has been given as an input.
        Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit.
        Print the positive integer value after toggling all bits”.*/
import java.util.Scanner;

public class ToggleBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a positive integer
        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();

        // Toggle bits starting from the most significant bit
        int result = toggleBits(num);

        // Output the result
        System.out.println("After toggling bits: " + result);
    }

    // Function to toggle bits starting from the most significant bit
    private static int toggleBits(int num) {
        // Find the position of the most significant bit
        int msbPos = 0;
        int temp = num;
        while (temp > 0) {
            msbPos++;
            temp = temp >> 1;
        }

        // Toggle all bits starting from the most significant bit
        for (int i = 0; i < msbPos; i++) {
            num = num ^ (1 << i);
        }

        return num;
    }
}

