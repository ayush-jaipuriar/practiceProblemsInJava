import java.util.*;
import java.io.*;
import java.text.*;

class STFOOD {
    // SOLUTION BEGIN
    void pre() throws Exception {
    }

    void solve(int TC) throws Exception {
        // int n = ni();
        // long ans = 0;
        // for (int i = 0; i < n; i++) {
        // long s = nl(), p = nl(), v = nl();
        // ans = Math.max(ans, v * (p / (s + 1)));
        // }
        // pn(ans);
        // //
        int n = ni();
        int a[] = new int[n];
        int b[] = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = ni();
        }
        for (int i = 0; i < n; i++) {
            b[i] = ni();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                sum = sum + a[i];
            } else {
                sum = sum + b[i];
            }
        }
        pn(sum);

    }

    // SOLUTION END
    void hold(boolean b) throws Exception {
        if (!b)
            throw new Exception("Hold right there, Sparky!");
    }

    DecimalFormat df = new DecimalFormat("0.00000000000");
    static boolean multipleTC = true;
    FastReader in;
    PrintWriter out;

    void run() throws Exception {
        in = new FastReader();
        out = new PrintWriter(System.out);

        int T = (multipleTC) ? ni() : 1;
        pre();
        for (int t = 1; t <= T; t++)
            solve(t);
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws Exception {
        new STFOOD().run();
    }

    int bit(long n) {
        return (n == 0) ? 0 : (1 + bit(n & (n - 1)));
    }

    void p(Object o) {
        out.print(o);
    }

    void pn(Object o) {
        out.println(o);
    }

    void pni(Object o) {
        out.println(o);
        out.flush();
    }

    String n() throws Exception {
        return in.next();
    }

    String nln() throws Exception {
        return in.nextLine();
    }

    int ni() throws Exception {
        return Integer.parseInt(in.next());
    }

    long nl() throws Exception {
        return Long.parseLong(in.next());
    }

    double nd() throws Exception {
        return Double.parseDouble(in.next());
    }

    class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception {
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}