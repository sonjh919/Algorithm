import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 0.15초: 최대 계산 횟수는 0.15억번(1500만)
(1 <= N <= 100000)
O(N) 가능! -> 다 만들어놔도 된다. -> dp
*/
public class Main {

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
        dp[0] = dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1]+1;
            if(i%3==0)dp[i] = Math.min(dp[i], dp[i/3]+1);
            if(i%2==0)dp[i] = Math.min(dp[i],dp[i/2]+1);
        }

        bw.write(dp[N] + "");

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
