import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int M,N;
    static int[][] map;
    static Queue<Tomato> ripe = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int day=0;

    public static class Tomato{
        int x;
        int y;
        int day;

        public Tomato(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1)ripe.add(new Tomato(i,j,0));
            }
        }

        BFS();
        if(countDay()) bw.write(day+"");
        else bw.write(-1+"");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean countDay() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==0)return false;
            }
        }
        return true;
    }

    private static void BFS() {
        while (!ripe.isEmpty()) {
            Tomato tomato = ripe.poll();
            day = tomato.day;

            int x,y;
            for (int i = 0; i < 4; i++) {
                x = tomato.x + dx[i];
                y = tomato.y + dy[i];

                if(0 <= x && x < M && 0<= y && y <N) {
                    if (map[x][y] == 0) {
                        ripe.add(new Tomato(x,y,day+1));
                        map[x][y] = 1;
                    }
                }
            }
        }
    }

}
