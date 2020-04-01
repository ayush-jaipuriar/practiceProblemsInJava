import java.io.*;
import java.util.*;
class lowerTriangulerMatrix {
	static boolean checkIfTriangular(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j=i+1; j<matrix.length; j++) {
				if (matrix[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int n = sc.nextInt();
		int[][] arr= new int[n][n];
		System.out.println("Enter the elements of the matrix");
		for (int i=0;i<n; i++) {
			for (int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean isTriangular = checkIfTriangular(arr);
		System.out.println(isTriangular? "Matrix is trianguler": "Matrix is not triangular");
		
		
		
		
		
		
	}
}
