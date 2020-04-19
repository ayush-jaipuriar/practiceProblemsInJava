import java.io.*;
import java.util.*;
class quickSort {
	public static void quickSort(int[] arr, int p, int q) {
		if (p<q) {
			int pivot = partition(arr, p, q);
			quickSort(arr, p,pivot-1);
			quickSort(arr, pivot+1, q);
		}
		
	}
	public static int  partition(int[] arr, int p, int q) {
		int pivot = q;
		int i=p-1;
		for (int j=p; j<=q; j++) {
			if (arr[j]<=arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr= new int[] {1,2,4,5,3,22,12,0,7};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
