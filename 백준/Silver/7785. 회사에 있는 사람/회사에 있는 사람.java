import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int N = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        //when
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        map.forEach((k,v) -> {
            if(v.equals("enter"))list.add(k);
        });

        Collections.sort(list);
        Collections.reverse(list);

        for(String s : list){
            bw.write(s + "\n");
        }
        
        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
