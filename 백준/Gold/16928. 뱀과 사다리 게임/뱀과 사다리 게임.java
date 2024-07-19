import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] map = new int[101];
    static int[] visited = new int[101];
    static int N,M;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N+M; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        BFS(1);
        bw.write(visited[100]-1+"");

        bw.flush();
        bw.close();
        br.close();
    }

    private static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;

        int current, dice;
        while(!queue.isEmpty()){
            current = queue.poll();

            for (int i = 1; i <= 6; i++) {
                dice = current+i;

                if(dice<=100){
                    if(map[dice]!=0)dice = map[dice];

                    if(visited[dice]==0) {
                        queue.add(dice);
                        visited[dice] = visited[current] + 1;
                    }
                }
            }
        }
    }

}
