import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번
(1 ≤ M ≤ N ≤ 1,000,000) -> 다돌면 O(N^2), sqrt()로 돌면 됨!
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            if(isPrime(i)){
                bw.write(i+"\n");
            }
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(final int m) {
        if(m==1) return false;
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if(m%i==0)return false;
        }
        return true;
    }
}
