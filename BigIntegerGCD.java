import java.io.*;
import java.util.*;
import java.math.*;

class BigIntegerGCD {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigInteger b1, b2;
        String input1 = in.readLine();
        String input2 = in.readLine();
        if (input1 != null && input2 != null) {
            b1 = new BigInteger(input1);
            b2 = new BigInteger(input2);
            BigInteger gcd = b1.gcd(b2);
            System.out.println(gcd.intValue());
        }

    }
}