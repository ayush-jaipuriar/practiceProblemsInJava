import java.io.*;
import java.util.*;

class primeFactorization {
    static int[] factors = new int[100];
    static int[] arguments = new int[100];
    static int length = 0;

    static void doPrimeFactorization(int n) {
        int d = 2;

        while (n > 1 && d * d <= n) {
            int k = 0;
            while (n % d == 0) {
                n /= d;
                k++;
            }
            if (k > 0) {

                factors[length] = d;
                arguments[length] = k;
                length++;
            }
            d++;
        }
        if (n != 1) {

            factors[length] = n;
            arguments[length] = 1;
            length++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number = sc.nextInt();
        doPrimeFactorization(number);
        sc.close();
        for (int i = 0; i < length; i++) {
            System.out.print(factors[i] + "^" + arguments[i]);
            if (i != length - 1) {
                System.out.print(" x ");
            }
        }

    }
}