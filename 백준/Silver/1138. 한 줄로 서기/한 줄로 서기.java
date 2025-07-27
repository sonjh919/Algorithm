import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            // input
            int N = Integer.parseInt(br.readLine());
            int[] tall = new int[N+1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i < N+1; i++) {
                tall[i] = Integer.parseInt(st.nextToken());
            }

            List<Integer> line = new ArrayList<>();
            for (int i = N; i >=1; i--) {
                line.add(tall[i], i);
            }

            for (final Integer i : line) {
                bw.write(i+" ");
            }

        // output
        bw.flush();
        br.close();
        bw.close();
    }
}

