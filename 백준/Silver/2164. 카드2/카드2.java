import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/*
시간제한 2초: 최대 계산 횟수는 2억번

1 <= N <= 500,000

시간 복잡도 : O(N) 가능, O(N^2) 불가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = n; i >= 1; i--) {
            deque.add(i);
        }

        while (deque.size() > 1) { // O(N)
            deque.removeLast();
            deque.addFirst(deque.removeLast());
        }

        bw.write(deque.peek() + "");

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
