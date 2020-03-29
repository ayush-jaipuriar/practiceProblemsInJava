import java.util.*;
import java.io.*;
class stringPalindrome1Line {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		boolean isPalindrome = inputString.equalsIgnoreCase(new StringBuilder(inputString).reverse().toString());
		System.out.println("String is palindrome ? : "+isPalindrome);
		
		
	}
}
