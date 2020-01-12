import java.io.*;
import java.util.*;

class partialSumArray {

    static int calculatePartialSum(int[] arr, int x, int y) {
        return (arr[y] - arr[x - 1]);
    }

    static int findPartialSum(int[] inputArray, int x, int y) {
        int[] arr = new int[inputArray.length];
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            arr[i] = sum;
        }
        return (calculatePartialSum(arr, x, y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            inputArray[i] = sc.nextInt();
        }
        System.out.println("Enter the range: x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int partialSum = findPartialSum(inputArray, x, y);
        System.out.println("The sum of array elements between the given range : " + partialSum);
        sc.close();
    }
}