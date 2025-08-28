import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


/*
시간제한 2.6초: 최대 계산 횟수는 2.6억번

1 <= L <= N <= 5,000,000

시간 복잡도 : O(NlogN) 까지 가능
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Deque<Data> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > current){ // 현재 값보다 크면 제거
                deque.removeLast();
            }

            deque.addLast((new Data(i, current)));

            if(deque.getFirst().index <= i-l){
                deque.removeFirst();
            }

            bw.write(deque.getFirst().value+" ");

        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    static class Data{
        int index;
        int value;

        public Data(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

}
