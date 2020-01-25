import java.util.*;
import java.io.*;

class longestConsecutiveSubarray {
    static int calculateLongestConsecutiveSubArray(int[] arr, int[] hash) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(hash, 0);
            int min = arr[i], max = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (hash[arr[j]] == 1) {
                    break;
                }
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                hash[arr[j]]++;
                if (max - min == j - i) {
                    answer = Math.max(answer, j - i + 1);
                }
            }
            // Without using hash map it would take o(n^3), the most optimal solution for
            // this question would be in o( n^2)
            // retur
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n;
        n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] hash = new int[max + 1];
        int result = calculateLongestConsecutiveSubArray(arr, hash);
        System.out.println("The Length of the Longest Consecutive Subarray : " + result);

    }
}