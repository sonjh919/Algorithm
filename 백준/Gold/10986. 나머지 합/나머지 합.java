import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번

N <= 100,000
A <= 100,000,000

O(N) 가능, O(NlogN + logM) 가능, O(N^2M) 불가능.
A*N < Integer.MAX_VALUE -> Long 필요!!
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

        /* 1. 구간합 세팅 -> 나머지도 같이!!
         나머지가 같으면 나누어 떨어짐!
        */
        int[] remainderCount = new int[M];
        long sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            remainderCount[(int) sum]++;
        }
        
        // 2. 동일한 나머지값을 그룹별로 2개씩 고르기! -> 나머지가 0이 되는 경우!
        long answer = remainderCount[0]; // 0인 경우는 한 개일 때도 포함!
        for (final int i : remainderCount) {
            if(i > 1){
                answer += ((long) i * (i - 1)) / 2;
            }
        }

        bw.write(answer + "");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

