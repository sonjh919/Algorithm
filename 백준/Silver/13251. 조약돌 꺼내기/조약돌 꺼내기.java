import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번
M (1 ≤ M ≤ 50)
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int M = Integer.parseInt(br.readLine());
        int[] num = new int[M];
        int sumAll = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            sumAll += num[i];
        }

        int K = Integer.parseInt(br.readLine());

        // 전체에서 2개뽑기 / 같은 색상에서 2개뽑기 합

        double all = 1;
        for (int i = 0; i < K; i++) {
            all *= sumAll-i;
        }

        double sum = 0;
        for (int i = 0; i < M; i++) {
            if(num[i]<K)continue;

            double tmp = 1;
            for (int j = 0; j < K; j++) {
                tmp *= (num[i]-j);
            }
            sum += tmp;
        }

        bw.write(sum/all+"");
        
        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
