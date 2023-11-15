package com.practice;

public class MaxProfitStock {

        public static void main(String[] args) {
            int pricesArr[] = {7,1,5,3,6,4};

            int maxPro = maxProfit(pricesArr);
            System.out.println("Max profit is: " + maxPro);
        }
        static int maxProfit(int[] priceArr) {
            int maxPro = 0;
            int minPrice = Integer.MAX_VALUE;
            for (int i = 0; i < priceArr.length; i++) {
                if(priceArr[i] < minPrice){
                    minPrice = priceArr[i];
                } else if(priceArr[i] - minPrice > maxPro){
                    maxPro = priceArr[i] - minPrice;
                }
//                minPrice = Math.min(minPrice, priceArr[i]);
//                maxPro = Math.max(maxPro, priceArr[i] - minPrice);
            }
            return maxPro;
        }


}
