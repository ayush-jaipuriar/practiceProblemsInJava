import java.io.*;
import java.util.*;

class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        int max = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        /*
         * int[] negative = new int[max + 1]; int[] hash = new int[max + 1];
         * Arrays.fill(hash, 0); Arrays.fill(negative, 0); for (int i = 0; i <
         * arr.length; i++) { if (arr[i] < 0) { negative[arr[i]]++; } hash[arr[i]]++;
         * 
         * } for (int i = 0; i < hash.length; i++) { if (hash[i] == 1 && negative[i] ==
         * 1) {
         * 
         * System.out.println("Singular element : " + -i); return; } else if (hash[i] ==
         * 1 && negative[i] == 0) { System.out.println("Singular element : " + i);
         * return; } }
         * 
         * System.out.println("There is no element that appears only once"); return;
         */

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hash.containsKey(arr[i])) {
                hash.put(arr[i], 1);
            } else {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                System.out.println(key);
            }
        }
        return;

    }
}