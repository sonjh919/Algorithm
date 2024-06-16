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

    static int N, M, i, j;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i1=0;i1<N;i1++){
            list.add(i1+1);
        }

        for (int i1 = 0; i1 < M; i1++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken())-1;
            j = Integer.parseInt(st.nextToken())-1;

            Collections.reverse(list.subList(i,j+1));
        }

        for(int i=0;i<N;i++){
            bw.write(list.get(i) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
