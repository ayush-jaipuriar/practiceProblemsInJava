import java.io.*;
import java.util.*;

class binarySearch {

    static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (int) Math.floor((left + right) / 2);
            if (arr[middle] == target) {
                System.out.println("Element is present in the array, at position " + middle);
                return;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target) {
                left = middle + 1;
            }
        }
        System.out.println("Element is not present in the array");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        binarySearch(arr, target);
    }
}