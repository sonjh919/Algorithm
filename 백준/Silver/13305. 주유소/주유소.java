import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long[] dist = new long[N-1];
        long[] cost = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N-1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N-1; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min_cost = cost[0];

        for (int i = 0; i < N-1; i++) {
            if(cost[i]<min_cost)min_cost = cost[i];
            sum += (min_cost*dist[i]);
        }

        bw.write(sum+"");

        bw.flush();
        bw.close();
        br.close();
    }

}
