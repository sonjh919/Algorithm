import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] map;
    static int count = 0;
    static int M, N, K, X, Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[M][N];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                X = Integer.parseInt(st.nextToken());
                Y = Integer.parseInt(st.nextToken());
                map[X][Y] = true;
            }

            //count
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if(map[x][y]){
                        DFS(x,y);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void DFS(int i, int j) {
        map[i][j] = false;

        // i--
        if(i > 0 && map[i-1][j])DFS(i-1,j);

        // j--
        if(j > 0 && map[i][j-1])DFS(i,j-1);

        // i++
        if(i < M-1 && map[i+1][j])DFS(i+1,j);

        //j++
        if(j < N-1 && map[i][j+1])DFS(i,j+1);
    }

}
