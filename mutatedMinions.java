import java.io.*;
import java.util.*;
import java.math.*;

class mutatedMinions {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input1 = in.readLine();
        if (input1 != null) {
            int t = Integer.parseInt(input1);
            for (int z = 0; z < t; z++) {
                String input2 = in.readLine();
                String[] input2Array = input2.trim().split("\\s+");
                int n = Integer.parseInt(input2Array[0]);
                int k = Integer.parseInt(input2Array[1]);
                String input3 = in.readLine();
                String[] input3Array = input3.trim().split("\\s+");
                int[] arr = new int[n];
                int count = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(input3Array[i]) + k;
                    if (arr[i] % 7 == 0) {
                        count++;
                    }
                }
                System.out.println(count);

            }
        }

    }
}