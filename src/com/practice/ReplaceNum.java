package com.practice;

import java.util.Scanner;

/* Substract any number between 0 to 1000000 each digit by 9
 * Input : 25843
 * Output : 74156
 *
 * Input : 58462314
 * Output : Given integer is out of range
 */
public class ReplaceNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int val = 0;
        if(Integer.parseInt(num)>=0 && Integer.parseInt(num)<=1000000)
        {
            for (int i = 0; i < num.length(); i++)
            {
                int k = 9-Integer.parseInt(String.valueOf(num.charAt(i)));
                val = val*10 + k;
            }
            System.out.println(val);
        }
        else
        {
            System.out.println("Given integer is out of range");
        }
    }
}
