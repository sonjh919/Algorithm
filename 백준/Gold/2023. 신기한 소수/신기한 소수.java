import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 2초: 최대 계산 횟수는 2억번

N(1 ≤ N ≤ 8)
N이 8일때 1~100,000,000 -> O(N)만 가능!
*/
public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        n = Integer.parseInt(br.readLine());

        // 2,3,5,7
        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int num, int len) {
        if (!isPrime(num)) {
            return;
        }
        if (n < len) {
            return;
        }
        if (n == len) {
            System.out.println(num);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            dfs(num * 10 + i, len + 1);
        }
    }

    // 소수 판별
    private static boolean isPrime(final int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
2 > 1
1 2 3 4 5 6 7 8 9 0 > 2
 */