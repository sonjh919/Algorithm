import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String[] s = br.readLine().split(":");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int gcdNumber = gcd(n,m);

        bw.write(n/gcdNumber + ":" + m/gcdNumber);

        // output
        bw.flush();
        br.close();
        bw.close();
    }

    private static int gcd(int n, int m) {
        while(m!=0){
            int temp = n%m;
            n = m;
            m = temp;
        }
        return n;
    }
}

