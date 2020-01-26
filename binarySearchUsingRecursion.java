import java.io.*;
import java.util.*;

class binarySearchUsingRecursion {

    static int binarySearch(int[] arr, int min, int max, int searchElement) {
        if (arr.length == 0 || min > max) {
            return -1;
        }
        int midPoint = (int) (min + max) / 2;
        if (arr[midPoint] == searchElement) {
            return midPoint;
        } else if (arr[midPoint] < searchElement) {
            return binarySearch(arr, midPoint + 1, max, searchElement);
        } else {
            return binarySearch(arr, min, midPoint + 1, searchElement);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the sorted array");
        size = sc.nextInt();
        System.out.println("Enter the elements of the sorted array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int searchElement = sc.nextInt();
        int result = binarySearch(arr, 0, arr.length - 1, searchElement);
        if (result == -1) {
            System.out.println("Searched Element was not found in the given array");
        } else {
            System.out.println("Searched Element found in the given array at index " + result);
        }
    }
}