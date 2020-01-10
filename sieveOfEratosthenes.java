import java.io.*;
import java.util.*;

class sieveOfEratosthenes {

    static void findPrimes(int limit) {
        int[] primeNumbers = new int[limit + 1];
        Arrays.fill(primeNumbers, 1);
        for (int i = 2; i < Math.sqrt(limit); i++) {
            if (isPrime(i)) {
                for (int j = 2; i * j <= limit; j++) {
                    primeNumbers[i * j] = 0;
                }
            }
        }
        displayPrimes(primeNumbers);

    }

    static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void displayPrimes(int[] primeNumbers) {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;
        System.out.println("Enter the number");
        limit = sc.nextInt();
        sc.close();
        findPrimes(limit);

    }
}