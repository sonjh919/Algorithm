import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번
 T(1 ≤ T ≤ 1,000)
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int N = Integer.parseInt(br.readLine());
        int A;
        int B;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write((A*B) / BigInteger.valueOf(A).gcd(BigInteger.valueOf(B)).intValue()+"\n");
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
