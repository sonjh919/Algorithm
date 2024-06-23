import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<Integer> list = new ArrayList<>();
    static int sum = 0, a,b,c;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);

        a = list.get(0);
        b = list.get(1);
        c = list.get(2);

        //when
        if(a+b>c) sum += a+b+c;
        else sum += (a+b)*2-1;
        bw.write(String.valueOf(sum));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
