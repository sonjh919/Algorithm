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

        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();


        for (int i = 1; i <= N; i++) {
            String temp = br.readLine();
            map1.put(i, temp);
            map2.put(temp,i);
        }

        //when
        for (int i = 0; i < M; i++) {
            String S = br.readLine();
            if ('1' <= S.charAt(0) && S.charAt(0) <= '9') {
                bw.write(map1.get(Integer.parseInt(S))+"\n");
            }
            else
                bw.write(map2.get(S)+"\n");
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
