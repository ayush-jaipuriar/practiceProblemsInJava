import java.io.*;
import java.util.*;

class bufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter a string");
        // String st = in.readLine();
        // System.out.println(st.toUpperCase());
        // int inputNumber = Integer.parseInt(in.readLine());
        // System.out.println(inputNumber);

        Integer boxedPrimitive = 254;
        System.out.println(boxedPrimitive);
        System.out.println((boxedPrimitive.toString()).contains("6"));
        System.out.println((boxedPrimitive.toString()).startsWith("22"));
        System.out.println(Character.isDigit((boxedPrimitive.toString()).charAt(2)));
    }
}