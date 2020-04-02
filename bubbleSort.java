import java.io.*;
import java.util.*;
class bubbleSort {

	static void performBubbleSort(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements present in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr= new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));
		performBubbleSort(arr);
		
		
		
		
		
	}
}
