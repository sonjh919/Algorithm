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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer A = new StringTokenizer(br.readLine());
        StringTokenizer B = new StringTokenizer(br.readLine());

        int tmp;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            tmp = Integer.parseInt(A.nextToken());
            if(tmp==0)list.add(Integer.parseInt(B.nextToken()));
            else B.nextToken();
        }

        Collections.reverse(list);
        N = Integer.parseInt(br.readLine());
        A = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(A.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            bw.write(list.get(i)+ " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
