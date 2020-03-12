import java.io.*;
import java.util.*;
import java.math.*;

class Main {
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
                Map<String, Integer> hash = new HashMap<>();
                String input3 = in.readLine();
                String[] input3Array = input3.trim().split("\\s+");
                for (int i = 0; i < n; i++) {
                    hash.put(input3Array[i], 0);
                }

                for (int y = 0; y < k; y++) {

                    String input4 = in.readLine();
                    String[] input4Array = input4.trim().split("\\s+");
                    int l = Integer.parseInt(input4Array[0]);

                    for (int i = 1; i <= l; i++) {

                        if (hash.containsKey(input4Array[i])) {
                            hash.put(input4Array[i], 1);
                        }
                    }

                }
                System.out.println(hash);
                for (int i = 0; i < n; i++) {

                    if (hash.get(input3Array[i]) == 1) {
                        System.out.print("YES ");
                    } else {
                        System.out.print("NO ");
                    }

                }
                System.out.println();
            }
        }
    }
}