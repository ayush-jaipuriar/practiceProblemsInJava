import java.util.*;
import java.io.*;

class reverseStringUsingRecursion {

    static String reverseString(String st) {

        if (st.length() == 0) {
            return "Empty String provided";
        }

        if (st.length() == 1) {
            return st;
        }

        return reverseString(st.substring(1)) + st.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String st;
        st = sc.nextLine();
        st = reverseString(st);
        System.out.println(st);
    }
}