import java.util.*;
import java.io.*;

class primeNumberBruteForce {
    public static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println((checkPrime(number)) ? "Number is prime" : "Number is not prime");

    }
}