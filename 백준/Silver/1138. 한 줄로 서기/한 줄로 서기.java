import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번
N은 10보다 작거나 같은 자연수. -> 시간 복잡도는 신경 안써도 될 듯?
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 1. arr 세팅
        int[] arr = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. List로 넣기
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = arr.length - 1; i > 0; i--) {
            list.add(arr[i], i);
        }

        // output
        for (final Integer i : list) {
            bw.write(i + " ");
        }

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

