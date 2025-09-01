import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번
N, M(2 ≤ N, M ≤ 100)
V = N*M, E = V(V-1)/2
O(V+E) = 약 10000 + 50000000 번-> bfs 가능
*/

public class Main {
    static boolean[][] visited;
    static int[][] maze;

    static int N,M;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M];

        String line;
        for (int i = 0; i < N; i++) {
            line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j)-'0'; // 이걸 왜 안빼줬을까..
            }
        }

        bfs(0,0);
        
        bw.write(maze[N-1][M-1]+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(int row, int col) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(row, col));
        visited[row][col] = true;

        while(!queue.isEmpty()){
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = node.row + dx[i];
                int y = node.col + dy[i];

                if(0 <= x && x < N && 0 <= y && y < M && !visited[x][y] && maze[x][y]==1){
                    visited[x][y] = true;
                    queue.add(new Node(x,y));
                    maze[x][y] = maze[node.row][node.col]+1;
                }

            }
        }
    }

    static class Node{
        int row;
        int col;

        public Node(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

}
