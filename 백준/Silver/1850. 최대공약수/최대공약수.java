import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int n = BigInteger.valueOf(A).gcd(BigInteger.valueOf(B)).intValue();

        for (int i = 0; i < n; i++) {
            bw.write('1');
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
