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

    static int N, M;
    static double sum = 0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        M = Collections.max(list);
        for(int i=0;i<N;i++){
            sum += (double) list.get(i) /M*100;

        }
        bw.write(String.valueOf(sum/N));

        bw.flush();
        bw.close();
        br.close();
    }
}
