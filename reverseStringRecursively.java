import java.io.*;
import java.util.Scanner;

class reverseStringRecursively {

    public static String reverse(String argumentString) {
        if (argumentString.length() <= 1)
            return argumentString;

        return reverse(argumentString.substring(1)) + argumentString.charAt(0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string to be reversed: ");
        s = sc.nextLine();
        sc.close();
        String resveredStringAfterRecursion = reverse(s);
        System.out.println("String obtained after reversal using recusion : " + resveredStringAfterRecursion);
    }
}