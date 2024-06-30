import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Boolean> S = new HashMap<>();

        for (int i = 0; i < N; i++) {
            S.put(br.readLine(), false);
        }

        //when
        int count = 0;
        for (int i = 0; i < M; i++) {
            if(S.containsKey(br.readLine()))count++;
        }

        bw.write(String.valueOf(count));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
