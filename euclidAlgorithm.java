import java.io.*;
import java.util.*;
class euclidAlgorithm {
	public static int euclidAlgo(int a, int b) {
		if (b==0) {
			return a;
		} 
			return euclidAlgo(b, a%b);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt(), b = sc.nextInt();
		int gcd = euclidAlgo(a,b);
		System.out.println("The GCD is : " + gcd);
		
		
		
	}
}
