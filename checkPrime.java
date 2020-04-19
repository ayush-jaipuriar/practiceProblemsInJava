import java.io.*;
import java.util.*;
class checkPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n= sc.nextInt();
		int m = (int)Math.sqrt(n);
		boolean isPrime = true;
		if (n<=1) {
			isPrime = false;
		}
		if (n%2==0) {
			isPrime = false;
		}
		for (int i=3; i<=m; i+=2) {
			if (n%i==0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime?  "Yes, the number is prime" : "No, the number is not prime");
		
		
		
		
		
	}
}
