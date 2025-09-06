import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

/*
시간제한 2초: 최대 계산 횟수는 2억번

(1 ≤ N ≤ 100,000)

O(N), O(NlogN) 가능.
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while(pq.size()>1){
            long tmp1 = pq.poll();
            long tmp2 = pq.poll();

            sum += tmp1 + tmp2;
            pq.add(tmp1 + tmp2);
        }

        bw.write(sum+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}

/*
10 + 20
(10 + 20) + 40
(10 + 20) + (10 + 20 + 40) + 50
 */