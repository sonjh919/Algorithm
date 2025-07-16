import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[N+1];
        
        if(N==1){
            bw.write("1");
            br.close();
            bw.close();
            return;
        }

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        bw.write(dp[N]+"");
        // output
        br.close();
        bw.close();
    }
}

