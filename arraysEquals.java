import java.io.*;
import java.util.*;

class arraysEquals {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 2 };
        int[] arr2 = new int[] { 1, 2, 3, 4, 2 };
        int[] arr3 = new int[] { 1, 2, 3, 2, 4, 3 };

        System.out.println("Comparing the 1st two arrays : " + Arrays.equals(arr1, arr2));
        System.out.println("Comparing the 2nd and 3rd arrays : " + Arrays.equals(arr1, arr3));

        // Comparing the Array slices for equality

        System.out.println("Comparing array slices : " + Arrays.equals(arr1, 4, 4, arr3, 4, 4));

        // Arrays.mismatch()
        System.out.println("Array mismatch : " + Arrays.mismatch(arr1, arr3));

    }
}