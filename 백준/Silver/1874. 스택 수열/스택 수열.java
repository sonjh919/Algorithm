import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*
시간제한 2초: 최대 계산 횟수는 2억번

1 <= N <= 100,000

시간 복잡도 : O(NlogN) 까지 가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // input
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int count = 1; // 1부터 시작
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            // 현재 숫자까지 push
            if (count <= num) {
                while (count <= num) {
                    stack.push(count++);
                    sb.append("+\n");
                }
            }

            // stack의 top이 num이면 pop
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            }
            // 만들 수 없는 경우
            else {
                possible = false;
                break;
            }
        }

        if (possible) {
            bw.write(sb.toString());
        } else {
            bw.write("NO\n");
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}

/*
1 2 5 7 8
+ + + + - -


수열(빠진거)
4 3 6 8 7 5 2 1
 */