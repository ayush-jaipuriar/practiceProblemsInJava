import java.io.*;
import java.util.Scanner;

class stringPalindrome {

    public static boolean checkPalindrome(String inputString) {
        inputString = inputString.toLowerCase();
        int index = 0;
        int lastIndex = inputString.length() - 1;
        while (index < lastIndex) {
            char forwardChar = inputString.charAt(index);
            char backwardChar = inputString.charAt(lastIndex);
            while (forwardChar == ' ') {
                index++;
                forwardChar = inputString.charAt(index);
            }
            while (backwardChar == ' ') {
                lastIndex--;
                backwardChar = inputString.charAt(lastIndex);
            }
            if (forwardChar != backwardChar) {
                return false;

            }
            index++;
            lastIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to check if its palindrome or not : ");
        String inputString = sc.nextLine();
        boolean result = (checkPalindrome(inputString)) ? true : false;
        if (result) {
            System.out.println("The input string is a palindrome");
        } else {
            System.out.println("The input string is not a palindrome");
        }

    }
}