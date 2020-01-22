import java.util.*;

class houseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bruteforce solution o(n^2)
        // Does not work, fails for test case [2,1,1,2]
        /*int max = 0, earning = 0;
        for (int i = 0; i < n; i++) {
            earning = 0;
            for (int j = i; j < n; j++) {
                earning += arr[j];
                if (earning > max) {
                    max = earning;
                }
            }
        }*/

        // Using DP without memoization, time complexity is O(n) and space complexity is O(1)
        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + arr[i], prev1);
            prev2 = tmp;
        }
        System.out.println(prev1); 
    }
}