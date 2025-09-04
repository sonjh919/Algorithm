import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번

(1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

O(K) 가능.
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            stack.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        while(!stack.empty()){
            sum += K/stack.peek();
            K %= stack.pop();

            if(K==0)break;
        }

        bw.write(sum+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
