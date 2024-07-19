import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int M,N,H;
    static int[][][] map;
    static Queue<Tomato> ripe = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static int day=0;

    public static class Tomato{
        int x;
        int y;
        int z;
        int day;

        public Tomato(int x, int y,int z, int day){
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                    if(map[i][j][k]==1)ripe.add(new Tomato(k,j,i,0));
                }
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

    for (int i = 0; i < H; i++) {
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                if (map[i][j][k] == 0)
                    return false;
            }
        }
    }
        return true;
    }

    private static void BFS() {
        while (!ripe.isEmpty()) {
            Tomato tomato = ripe.poll();
            day = tomato.day;

            int x,y,z;
            for (int i = 0; i < 6; i++) {
                x = tomato.x + dx[i];
                y = tomato.y + dy[i];
                z = tomato.z + dz[i];

                if(0 <= x && x < M && 0<= y && y <N && 0<=z && z<H) {
                    if (map[z][y][x] == 0) {
                        ripe.add(new Tomato(x,y,z,day+1));
                        map[z][y][x] = 1;
                    }
                }
            }
        }
    }

}
