import java.io.*;
import java.util.*;

class buyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int profit = 0;
        int maxProfit = 0;

        // bruteforce

        /*
         * for (int i = 0; i < n; i++) { profit = 0; for (int j = i; j < n; j++) {
         * profit = arr[j] - arr[i]; if (profit > maxProfit) { maxProfit = profit; } } }
         */
        // The two pointer solution fails some testcases so its discarded
        // int i = 0, j = n - 1;
        // while (i <= j) {
        // profit = arr[j--] - arr[i++];
        // if (profit > maxProfit) {
        // maxProfit = profit;
        // }

        // }

        // using the max approach of traversing through the array only once
        int price = Integer.MAX_VALUE;
        maxProfit = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < price) {
                price = arr[i];
            } else {
                maxProfit = (arr[i] - price > maxProfit) ? arr[i] - price : maxProfit;
            }
        }
        System.out.println(maxProfit);
    }
}