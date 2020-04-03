import java.io.*;
import java.util.*;
class selectionSort {
	static void performSelectionSort(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			int min = i;
			for (int j=i+1;j<arr.length; j++) {
				if (arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr= new int[n];
		for (int i=0; i<n; i++){
			arr[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
		performSelectionSort(arr);
		
		
		
		
	}
}
