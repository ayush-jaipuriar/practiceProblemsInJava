package javaBasics.question1;
import java.io.*;

/* JAVA BASICS Question 1 
 * Ayush Jaipuriar, 1705225
 * House Denver
 * 
 */


class Adder extends Arithmetic {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Adder ob = new Adder();
		try {
			int input1 = Integer.parseInt(in.readLine());
			int input2 = Integer.parseInt(in.readLine());
			int sum = ob.add(input1, input2);
			System.out.println(sum);
			
		} catch (IOException e) {
			System.out.println("Sorry, an error occurred");
			e.printStackTrace();
		}
	}

}
