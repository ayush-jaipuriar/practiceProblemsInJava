package javaBasics.question4;
import java.io.*;

//Java Basics Question 4 by Ayush Jaipuriar 1705225 House Denver

public class DataTypeSize {
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());		
		long input;
		for (int z=0; z<t; z++) {
			try {
				input = Long.parseLong(in.readLine());
				System.out.println(input+" can be fitted in: ");
				if(input>=Byte.MIN_VALUE && input<=Byte.MAX_VALUE) {
					System.out.println("byte");
				} 
				if (input>=Short.MIN_VALUE && input<=Short.MAX_VALUE) {
					System.out.println("short");
				}
				if (input>=Integer.MIN_VALUE && input<=Integer.MAX_VALUE) {
					System.out.println("integer");
				}
				if (input>=Long.MIN_VALUE && input<=Long.MAX_VALUE) {
					System.out.println("long");
				}
		} catch (Exception e) {
			System.out.println("It can't be fitted anywhere!");
		}
		
		
		
}

}
}
