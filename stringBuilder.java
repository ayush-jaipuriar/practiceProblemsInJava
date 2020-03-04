import java.io.*;
import java.util.*;

class stringBuilder {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder(in.readLine());
        System.out.println(st);
        StringBuilder copiedString = new StringBuilder();
        System.out.println(copiedString);
        for (int i = 0; i < st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                copiedString.append(st.charAt(i));
            }
        }
        System.out.println(copiedString);
    }
}