import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        List<Integer> list1 = new ArrayList<>();


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list1.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            map.put(Integer.parseInt(st.nextToken()), false);
        }

        //when
        for(Integer i : list1){
            map.replace(i, true);
        }

        StringBuilder sb = new StringBuilder();
        map.forEach((k,v) -> {
            if(v) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        });
        bw.write(sb.toString());

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
