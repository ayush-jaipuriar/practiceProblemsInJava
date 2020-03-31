import java.io.*;
import java.util.*;

class firstDuplicate {

    static int firstDuplicateNumberBruteForce(int arr[]) {
        int minIndex = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    minIndex = Math.min(j, minIndex);
            }
        }
        if (minIndex == arr.length)
            return -1;
        else
            return arr[minIndex];

    }

    static int firstDuplicateOptimal(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.contains(arr[i]) == false) {
                h.add(arr[i]);
            } else {
                return arr[i];
            }
        }
        return -1;
    }

    static int firstDuplicateOptimalUltraOptimal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i]) - 1] < 0) {
                return Math.abs(arr[i]);
            } else {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter the values of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long startTime = System.nanoTime();
        int resultBruteForce = firstDuplicateNumberBruteForce(arr);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(resultBruteForce + " and time taken " + elapsedTime / Math.pow(10, 6));

        startTime = System.nanoTime();
        int resultOptimal = firstDuplicateOptimal(arr);
        elapsedTime = System.nanoTime() - startTime;

        System.out.println(resultOptimal + " and time taken " + elapsedTime / Math.pow(10, 6));

        startTime = System.nanoTime();
        int resultUltraOptimal = firstDuplicateOptimalUltraOptimal(arr);
        elapsedTime = System.nanoTime() - startTime;
        System.out.println(resultUltraOptimal + " and time taken " + elapsedTime / Math.pow(10, 6));
    }
}