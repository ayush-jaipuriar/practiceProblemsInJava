import java.io.*;
import java.util.*;

class twoSum {

    static void calculateTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (hash.containsKey(complement)) {
                System.out.println("The indices are : " + hash.get(complement) + " " + i);
                return;
            }
            hash.put(arr[i], i);
        }
        throw new IllegalArgumentException("no match found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of elements in the array");
        size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        calculateTwoSum(arr, target);
    }
}