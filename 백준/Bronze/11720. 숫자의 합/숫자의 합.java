import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 1초: 최대 계산 횟수는 1억번
N <= 100, O(n^2)도 가능
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");

        // sum
        int sum = 0;
        for (String num : s) {
            sum += Integer.parseInt(num);
        }

        // output
        bw.write(sum + "");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

