import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번

N (1 ≤ N ≤ 100,00)
K min(10^9, N2)

O(N*K), O(N^2)까지 가능
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> set = new HashSet<>(list);

        int max = Integer.MIN_VALUE;
        for (final Integer i : set) {
            max = Math.max(Collections.frequency(list, i), max);
        }

        bw.write(max+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
