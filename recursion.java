
class recursion {
    
    static int recursionMethod(int n) {

        if (n == 0)
            return 1;
        return (n * recursionMethod(n - 1));
    }

    public static void main(String[] args) {
        int result = recursionMethod(5);
        System.out.println(result);
    }
}