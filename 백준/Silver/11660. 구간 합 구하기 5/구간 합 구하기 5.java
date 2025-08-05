import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번

N <= 1024
M <= 100,000

O(N+M) 가능, O(logN + logM) 가능, O(N*M) 불가능. -> 완전탐색 불가능!!
O(N^2+M) 가능
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // N, M input
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 구간합 세팅
        int[][] arr = new int[N][N];
        int sum;
        for (int i = 0; i < N; i++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) { // O(N^2)라서 가능!!
                sum += Integer.parseInt(st.nextToken());
                arr[i][j] = sum;
                if(i > 0) arr[i][j] += arr[i-1][j]; // 세로 합
            }
        }

        // 합 구하기
        int x1, y1, x2, y2;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken())-1;
            y1 = Integer.parseInt(st.nextToken())-1;
            x2 = Integer.parseInt(st.nextToken())-1;
            y2 = Integer.parseInt(st.nextToken())-1;

            sum = arr[x2][y2];
            if(x1 > 0) sum -= arr[x1-1][y2];
            if(y1 > 0) sum -= arr[x2][y1-1];

            if(x1 > 0 && y1 > 0) sum += arr[x1-1][y1-1];

            bw.write(sum + "\n");
        }

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

