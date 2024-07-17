import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,K;
    static int[] time = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        BFS(N);

        bw.write(time[K]-1+"");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        time[n]=1;

        while(!queue.isEmpty()){
            int current = queue.poll();

            if(current==K)break;
            if(current+1 <= 100000 && time[current+1]==0){
                queue.add(current+1);
                time[current+1] = time[current]+1;
            }
            if(current-1 >= 0 && time[current-1]==0){
                queue.add(current-1);
                time[current-1] = time[current]+1;
            }
            if(current*2 <= 100000 && time[current*2]==0){
                queue.add(current*2);
                time[current*2] = time[current]+1;
            }
        }
    }


}
