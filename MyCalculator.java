package javaBasics.question3;
import java.io.*;

/* Java Basics Question 3
 * By Ayush Jaipuriar, 1705225, House Denver
 */
public class MyCalculator {
	static long power(int number, int power) throws Exception {
		if (number==0 && power==0) {
			throw new Exception("n and p should not be zero");
		} else if (number<0 && power<0) {
			throw new Exception("n and p should not be negative");
		} else {
			return (long)Math.pow(number, power);
		}
	}
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number, power;
		try {
			System.out.println("Input the number");
			number = Integer.parseInt(in.readLine());
			System.out.println("Input the power");
			power = Integer.parseInt(in.readLine());
			System.out.println("The result is : " + power(number, power));
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
