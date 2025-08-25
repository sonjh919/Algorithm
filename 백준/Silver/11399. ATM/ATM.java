import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번
N <= 1,000
O(N^2)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 음 그냥 정렬하면 되는거 아닌가
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // O(nlogn)

        // 깨알 합배열 ㅎ
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = arr[i] + sum[i-1];
        }

        int answer = 0;
        for (int i : sum) {
            answer += i;
        }

        bw.write(answer+"");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

