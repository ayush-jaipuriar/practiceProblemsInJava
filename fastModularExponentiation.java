import java.util.*;
import java.io.*;

class fastModularExponentiation {

    static long findExpo(int a, long n, int m) {
        if (a == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return findExpo(a * a % m, n / 2, m);
        }
        return (a * findExpo(a, n - 1, m)) % m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The format is : a^n % m");
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        long result = findExpo(a, n, m);
        System.out.println("The result : " + result);
    }
}