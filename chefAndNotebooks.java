import java.io.*;
import java.util.*;

class chefAndNotebooks {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input1 = in.readLine();
        boolean flag = false;
        if (input1 != null) {
            int t = Integer.parseInt(input1);
            for (int q = 0; q < t; q++) {
                String input2 = in.readLine();
                String[] in1 = input2.trim().split("\\s+");
                int x = Integer.parseInt(in1[0]);
                int y = Integer.parseInt(in1[1]);
                int k = Integer.parseInt(in1[2]);
                int n = Integer.parseInt(in1[3]);
                int[][] arr = new int[n][2];
                long sumLeft = x - y;
                long temp = sumLeft;
                flag = false;

                for (int i = 0; i < n; i++) {
                    sumLeft = temp;
                    String input3 = in.readLine();
                    String[] in3 = input3.trim().split("\\s+");
                    arr[i][0] = Integer.parseInt(in3[0]);
                    arr[i][1] = Integer.parseInt(in3[1]);
                    if (arr[i][0] >= x - y && arr[i][1] <= k) {

                        flag = true;
                    }

                }
                System.out.println(flag ? "LuckyChef" : "UnluckyChef");

            }
        }
    }
}