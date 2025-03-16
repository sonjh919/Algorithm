import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static Long[] dp = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i-2] + dp[i-3];
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n] + "\n");
        }

        br.close();
        bw.close();
    }

}
