import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 5초: 최대 계산 횟수는 0.5억번
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] dp = new int[15][15];

        for (int i = 0; i < 15; i++) {
            dp[i][1] = 1;
            dp[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        // input
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[K][N]+"\n");
        }


        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
