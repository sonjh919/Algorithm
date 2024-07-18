import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int I;
    static Point src = new Point();
    static Point dst = new Point();
    static int[][] visited;

    static int[] dx = {-2,-2,-1,-1,1,1,2,2};
    static int[] dy = {1,-1,-2,2,-2,2,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            I = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            src.x = Integer.parseInt(st.nextToken());
            src.y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            dst.x = Integer.parseInt(st.nextToken());
            dst.y = Integer.parseInt(st.nextToken());

            visited = new int[I][I];

            BFS();
            bw.write(visited[dst.x][dst.y]-1+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void BFS() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(src);
        visited[src.x][src.y] = 1;

        int x,y;
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            if(tmp.x==dst.x && tmp.y==dst.y)break;

            for (int i = 0; i < 8; i++) {
                x = tmp.x + dx[i];
                y = tmp.y + dy[i];

                if(x>I-1 || x<0 || y>I-1 || y<0)continue;
                if(visited[x][y]>0)continue;

                visited[x][y] = visited[tmp.x][tmp.y]+1;
                queue.add(new Point(x,y));

            }


        }
    }

}
