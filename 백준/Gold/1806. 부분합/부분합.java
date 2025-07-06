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
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int S = Integer.parseInt(s[1]);

        s = br.readLine().split(" ");
        int[] arr = new int[N+1];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int point1 = 0;
        int point2 = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;

        while (point1 <= N && point2 <= N) {
            if (sum >= S && count > point2 - point1) {
                count = point2 - point1;
            }

            if(sum < S) sum += arr[point2++];
            else sum -= arr[point1++];
        }

        if (count == Integer.MAX_VALUE) {
            count = 0;
        }
        bw.write(count + "");

        // output
        br.close();
        bw.close();
    }
}
