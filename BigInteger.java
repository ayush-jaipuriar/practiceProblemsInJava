import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(13);
        BigInteger b2 = BigInteger.valueOf(21212);
        System.out.println(b1.isProbablePrime(1));
        System.out.println(b2.isProbablePrime(1));
    }
}