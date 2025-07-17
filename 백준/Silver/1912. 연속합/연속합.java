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

        int[] arr = new int[N];
        int[] dp = new int[N];


        String[] s = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        dp[0] = arr[0];
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
            max = Math.max(dp[i], max);
        }

        bw.write(max+"");

        // output
        br.close();
        bw.close();
    }
}

