import java.io.*;
import java.util.*;

class littleElephantAndCandiesCodeChef {
    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String checkNull = in.readLine();
        if (checkNull != null) {
            int t = Integer.parseInt(checkNull);

            for (int x = 0; x < t; x++) {
                String input1 = in.readLine();
                String[] input = input1.split(" ");
                int n = Integer.parseInt(input[0]);
                long c = Long.parseLong(input[1]);

                long sum = 0;
                long[] arr = new long[n];
                input1 = in.readLine();
                String input2[] = input1.split(" ");

                for (int i = 0; i < n; i++) {
                    arr[i] = Long.parseLong(input2[i]);
                    sum += arr[i];
                }

                if (sum > c) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }

            }
        }

    }
}