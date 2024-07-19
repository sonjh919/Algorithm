import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int N,M;

    static class Location{
        int x;
        int y;
        boolean isBroke;
        int location;

       Location(int x, int y, boolean isBroke, int location){
         this.x = x;
         this.y = y;
         this.isBroke = isBroke;
         this.location = location;
       }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M][2];
        for (int i = 0; i < N; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = ch[j]-'0';
            }
        }

        bw.write(BFS()+"");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int BFS() {
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(0,0,false,1));
        visited[0][0][0] = true;

        Location location;
        while(!queue.isEmpty()){
            location = queue.poll();

            if(location.x == N-1 && location.y == M-1)return location.location;

            int x,y;
            for (int i = 0; i < 4; i++) {
                x = location.x + dx[i];
                y = location.y + dy[i];

                if(x < 0 || x>=N || y< 0 || y >= M)continue;

                if(location.isBroke) {
                    if (map[x][y] == 0 && !visited[x][y][1]) {
                        visited[x][y][1] = true;
                        queue.add(new Location(x, y, true, location.location + 1));
                    }
                }
                else{
                    if(map[x][y]==1){
                        visited[x][y][1] = true;
                        queue.add(new Location(x,y,true, location.location+1));
                    }
                    else if(!visited[x][y][0]){
                        visited[x][y][0] = true;
                        queue.add(new Location(x,y,false,location.location+1));
                    }
                }
            }
        }
        return -1;
    }
}
