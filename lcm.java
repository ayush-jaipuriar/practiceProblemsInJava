import java.io.*;
import java.util.*;
class lcm {
	public static int gcd(int a, int b) {
		if (b==0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	public static int findLCM(int a, int b) {
		return b*a/gcd(a,b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt(), b= sc.nextInt();
		int LCM = findLCM(a, b);
		System.out.println("The LCM is : " + LCM);
		
		
		
		
		
	}
}
