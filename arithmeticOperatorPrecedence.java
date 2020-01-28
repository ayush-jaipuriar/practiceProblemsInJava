import java.io.*;
import java.util.*;

class arithmeticOperatorPrecedence {
    public static void main(String[] args) {
        char ch1 = 50;
        System.out.println("ch1: " + ch1); // ch1 will be assigned corresponding UTF 16 value which is 2

        System.out.println("(73-ch1): " + (73 - ch1)); // operands smaller than int are promoted to int, here char ch1
                                                       // gets promoted to int , 73-50=23
        System.out.println("(ch1-'3'): " + (ch1 - '3')); // here again, char1 and '3' are promoted to int

        System.out.println("('a'+'b'): " + ('a' + 'b')); // 'a' and 'b' are promoted to int and respective equivalents
                                                         // of a and b are added

    }
}