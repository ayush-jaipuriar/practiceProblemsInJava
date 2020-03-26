import java.io.*;
import java.util.*;
class BuyAndSellStocksII {

	static int peakAndValleyApproach(int[] prices) {
		int maxProfit = 0;
		if (prices==null || prices.length==0) {
			return 0;
		}
		int peak = prices[0], valley= prices[0];
		int i=0;
		while (i<prices.length-1) {
			while (i<prices.length-1 && prices[i]>=prices[i+1]) 
				i++;
			valley = prices[i];
			while (i<prices.length-1 && prices[i]<=prices[i+1])
				i++;
			peak = prices[i];
			maxProfit += peak - valley;
		}
		return maxProfit;
	}
	
	static int simpleOnePassApproach(int[] prices) {
		int maxProfit = 0;
		if (prices==null || prices.length==0) 
			return 0;
		for (int i=0; i<prices.length; i++) {
			if (arr[i]<arr[i+1]) {
				maxProfit+= arr[i+1] - arr[i];
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of days");
		int n = sc.nextInt();
		System.out.println("Enter the stock prices for the respective days");
		int[] prices = new int[n];
		for (int i=0; i<n; i++) {
			prices[i] = sc.nextInt();
		}
		// I will solve the problem using 2 approaches
		// The 1st approach will be the Peak and Valley Approach 
		// The 2nd approach would be the Simple One Pass Apprach
		long startTime = System.nanoTime();
		
		int maxProfit  = peakAndValleyApproach(prices);
		
		long endTime =System.nanoTime() - startTime;
		
		System.out.println("The max profit using the peak and valley approach = "+ maxProfit);
		System.out.println("The runtime using peak and valley approach = "+ endTime/Math.pow(10,6));
		
		startTime = System.nanoTime();
		maxProfit = simpleOnePassApproach(prices);
		endTime = System.nanoTime() - startTime;
		System.out.println("The max profit using the simple one pass approach = "+ maxProfit);
		System.out.println("The runtime using the simple one pass approach  = "+ endTime/Math.pow(10,6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
