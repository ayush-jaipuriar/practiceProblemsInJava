/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int target = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        int back = 0, front = 0;
        int sum = 0;
        while (front <= n) {
            if (sum == target) {
                System.out.println(back + 1 + " " + front);
                return;
            } else if (sum < target) {
                sum += arr[front++];
            } else {
                sum -= arr[back++];
            }
        }
        System.out.println(-1);
    }
}