import java.util.Scanner;

class nthFibonacci {
    
    static int fibonacciMethod(int n) {
        if (n<=1) 
            return n;
        else 
            return fibonacciMethod(n - 2) + fibonacciMethod(n - 1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n till which fibonacci series sum will be calculated");
        n = sc.nextInt();
        int result = fibonacciMethod(n);
        System.out.println("The result : "+ result);
        
    }
}