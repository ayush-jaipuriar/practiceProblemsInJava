package javaBasics.question5;
import java.io.*;

//Java Basics Question 5, by Ayush Jaipuriar 1705225 House Denver

public class PrintSeries {
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int queries = Integer.parseInt(in.readLine());
		for (int z=0; z<queries; z++) {
			int a = Integer.parseInt(in.readLine());
			int b = Integer.parseInt(in.readLine());
			int n = Integer.parseInt(in.readLine());
			for (int j = 0; j < n; j++) {
				a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
			}
			System.out.println();
	              
		}
	}

}
