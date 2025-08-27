import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번

N <= 500,000

시간 복잡도 : O(NlogN) 까지 가능, O(N^2) 불가능 -> 병합 정렬 사용!
*/
public class Main {

    public static int[] arr, tmp;
    public static long result; // N<= 500,000일 때, 최대 스왑 횟수는 NC2이므로 int 범위 초과 -> long!!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] answer = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) { // 스택이 안비어있고 && stack top 값이 더 작을 경우
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            bw.write(answer[i] + " ");
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}


