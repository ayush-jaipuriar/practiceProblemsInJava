import java.util.*;
import java.io.*;

class hashCollection {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n;
        System.out.println("Enter the size of the array");
        n = Integer.parseInt(in.readLine());
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        System.out.println("Printing the input elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Implementing a HashMap to count the number of duplicate elements
        System.out.println("Duplicates in the array");
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (count.get(arr[i]) == null) {
                count.put(arr[i], 1);
            } else {
                count.put(arr[i], count.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> val : count.entrySet()) {
            if (val.getValue() > 1) {
                System.out.println(val.getValue());
            }
        }

    }
}