import java.util.Scanner;

class bitwiseAddition {
    
    public static int bitwiseAdd(int a, int b) {

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        int result = bitwiseAdd(a, b);
        System.out.println(result);
    }
}